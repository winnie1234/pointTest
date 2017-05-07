package com.point.service.imp;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.point.dao.PointDao;
import com.point.dao.PointListDao;
import com.point.dto.PointOpExecution;
import com.point.entity.Point;
import com.point.enums.PointAction;
import com.point.enums.PointOpStatus;
import com.point.enums.PointStatus;
import com.point.service.AdminService;

@Service
public class AdminServiceImp implements AdminService {

	@Autowired
	private PointListDao pointListDao;

	@Autowired
	private PointDao pointDao;

	@Override
	@Transactional
	public PointOpExecution AddOnePointRecord(int userId, int corpId, String action, String status, int point,
			String description, Timestamp dealDate, int dealId, String dealType, Timestamp pointActionDate) {
		PointOpExecution result = new PointOpExecution();

		int validPoint = 0;
		int expiredPoint = 0;
		int freezingPoint = 0;
		if (PointStatus.available.equals(status)) {
			validPoint = point;
		} else if (PointStatus.freeze.equals(status)) {
			freezingPoint = point;
		} else if (PointStatus.expired.equals(status)) {
			expiredPoint = point;
		}

		try {

			if (PointAction.Add.equals(action)) {
				result = addPointToPointTable(userId, corpId, action, status, validPoint, expiredPoint, freezingPoint);
			} else if (PointAction.Minus.equals(action)) {
				result = minusPoint(userId, corpId, action, status, validPoint, expiredPoint, freezingPoint);
			} else if (PointAction.Unfreeze.equals(action)) {
				result = UnfreezingPoint(userId, corpId, action, status, validPoint, expiredPoint, freezingPoint);
			}

			if (result.getStatus().equals(PointOpStatus.Succ)) {
				insertToPointList(userId, corpId, action, status, point, description, dealDate, dealId, dealType,
						pointActionDate);
			}
			return result;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new PointOpExecution(userId, corpId, PointOpStatus.AddFail, e.getMessage());
		}
		//return new PointOpExecution(userId, corpId, PointOpStatus.AddFail);

	}

	public PointOpExecution addPointToPointTable(int userId, int corpId, String action, String status, int validPoint,
			int expiredPoint, int freezingPoint) throws Exception {
		try {
			Point userPoint = pointDao.queryByUserIdCorpId(userId, corpId);
			// this user not exist in Point Table
			if (userPoint == null) {
				// insert
				pointDao.insert(userId, corpId, validPoint, expiredPoint, freezingPoint);
				Point point = new Point();
				point.setCorpId(corpId);
				point.setUserId(userId);
				point.setValidPoint(validPoint);
				point.setExpiredPoint(expiredPoint);
				point.setfreezingPoint(freezingPoint);
				return new PointOpExecution(userId, corpId, PointOpStatus.Succ, point);
			} else {
				validPoint = validPoint + userPoint.getValidPoint();
				expiredPoint = expiredPoint + userPoint.getExpiredPoint();
				freezingPoint = freezingPoint + userPoint.getFreezingPoint();
				pointDao.updateByUserIdCorpId(userId, corpId, validPoint, expiredPoint, freezingPoint);

				userPoint.setValidPoint(validPoint);
				userPoint.setExpiredPoint(expiredPoint);
				userPoint.setfreezingPoint(freezingPoint);
				return new PointOpExecution(userId, corpId, PointOpStatus.Succ, userPoint);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new PointOpExecution(userId, corpId, PointOpStatus.AddFail, e.getMessage());
		}
	}

	public PointOpExecution minusPoint(int userId, int corpId, String action, String status, int validPoint,
			int expiredPoint, int freezingPoint) {
		try {
			Point userPoint = pointDao.queryByUserIdCorpId(userId, corpId);
			// this user not exist in Point Table
			if (userPoint == null) {
				return new PointOpExecution(userId, corpId, PointOpStatus.NonUser);
			} else if (validPoint <= userPoint.getValidPoint() && expiredPoint <= userPoint.getExpiredPoint()
					&& freezingPoint <= userPoint.getFreezingPoint()) {
				validPoint = validPoint - userPoint.getValidPoint();
				expiredPoint = expiredPoint - userPoint.getExpiredPoint();
				freezingPoint = freezingPoint - userPoint.getFreezingPoint();
				pointDao.updateByUserIdCorpId(userId, corpId, validPoint, expiredPoint, freezingPoint);

				userPoint.setValidPoint(validPoint);
				userPoint.setExpiredPoint(expiredPoint);
				userPoint.setfreezingPoint(freezingPoint);
				return new PointOpExecution(userId, corpId, PointOpStatus.Succ, userPoint);
			} else {
				return new PointOpExecution(userId, corpId, PointOpStatus.PointInsuff);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new PointOpExecution(userId, corpId, PointOpStatus.AddFail, e.getMessage());
		}
	}

	public PointOpExecution UnfreezingPoint(int userId, int corpId, String action, String status, int validPoint,
			int expiredPoint, int freezingPoint) {
		try {
			Point userPoint = pointDao.queryByUserIdCorpId(userId, corpId);
			// this user not exist in Point Table
			if (userPoint == null) {
				return new PointOpExecution(userId, corpId, PointOpStatus.NonUser);
			} else {
				if (freezingPoint <= userPoint.getFreezingPoint()) {
					validPoint = validPoint + userPoint.getValidPoint();
					expiredPoint = expiredPoint - userPoint.getExpiredPoint();
					freezingPoint = freezingPoint - userPoint.getFreezingPoint();

					pointDao.updateByUserIdCorpId(userId, corpId, validPoint, expiredPoint, freezingPoint);

					userPoint.setValidPoint(validPoint);
					userPoint.setExpiredPoint(expiredPoint);
					userPoint.setfreezingPoint(freezingPoint);
					return new PointOpExecution(userId, corpId, PointOpStatus.Succ, userPoint);

				} else {
					return new PointOpExecution(userId, corpId, PointOpStatus.PointInsuff);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new PointOpExecution(userId, corpId, PointOpStatus.AddFail, e.getMessage());
		}
	}

	public int insertToPointList(int userId, int corpId, String action, String status, int point, String description,
			Timestamp dealDate, int dealId, String dealType, Timestamp pointActionDate) {
		// insert deal to pointList
		int userSeqNum = pointListDao.selectSeqCountByUserIdCorpId(userId, corpId);
		int index = pointListDao.insert(userId, corpId, userSeqNum + 1, action, status, point, description, dealDate,
				dealId, dealType, pointActionDate);
		return index;
	}

}
