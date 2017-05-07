package com.point.dao;

import java.sql.Timestamp;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.point.BaseTest;
import com.point.enums.PointAction;
import com.point.enums.PointStatus;

public class PointlistDaoTest extends BaseTest {

	@Autowired
	PointListDao pointlistDao;
	
	@Test
	public void testSelectSeqCountByUserIdCorpId()
	{
		System.out.println("testSelectSeqCountByUserIdCorpId");
		int UserId = 6;
		int CorpId = 1;
		try
		{
			int seqCount = pointlistDao.selectSeqCountByUserIdCorpId(UserId,CorpId);
			System.out.println("SelectSeqCountByUserIdCorpId succ");
			System.out.println(seqCount);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	@Ignore
	public void testInsert()
	{
		System.out.println("testInsert");
		int userId = 6;
		int corpId = 1;
		int userSeqNum = 2;
		String action = PointAction.Add.toString();
		String status = PointStatus.available.toString();
		int point = 101;
		String description = action + " " + status + " " + point;
		Timestamp dealDate = new Timestamp(System.currentTimeMillis());
		int dealId = 2;
		String dealType = "Air";
		Timestamp pointActionDate = new Timestamp(System.currentTimeMillis());
		try
		{
			int index = pointlistDao.insert(userId, corpId, userSeqNum+1, action, status, point, description, dealDate, dealId, dealType,pointActionDate);
			System.out.println(index);
			System.out.println("Insert succ");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
