package com.point.service.imp;

import org.springframework.beans.factory.annotation.Autowired;

import com.point.dao.PointDao;
import com.point.entity.Point;
import com.point.entity.Pointlist;
import com.point.service.CommonService;

public class CommonServiceImp implements CommonService {

	@Autowired
	PointDao pointDao;
	
	@Override
	public Point getPointByUserId(int userId,int comanpyId) {
		// TODO Auto-generated method stub
		return pointDao.queryByUserIdCorpId(userId, comanpyId);
	}

	@Override
	public Pointlist getPointlistByUserId(int userId,int comanpyId) {
		// TODO Auto-generated method stub
		return null;
	}

}
