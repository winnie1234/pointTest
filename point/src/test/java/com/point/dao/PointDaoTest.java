package com.point.dao;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.point.BaseTest;
import com.point.entity.Point;

public class PointDaoTest extends BaseTest{

	@Autowired
	private PointDao pointDao;
	
	@Test
	@Ignore
	public void testInsert()
	{
		System.out.println("testInsert");
		int userId = 2;
		int corpId = 2;
		int validPoint = 200;
		int expiredPoint = 100;
		int freezingPoint = 300;
		try
		{
			pointDao.insert(userId, corpId, validPoint, expiredPoint, freezingPoint);
			System.out.println("insert succuss");			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	@Test
	@Ignore
	public void testUpdateByUserIdCorpId()
	{
		System.out.println("testUpdateByUserIdCorpId");
		int userId = 6;
		int corpId = 1;
		int validPoint = 100;
		int expiredPoint = 200;
		int freezingPoint = 300;
		try
		{
			pointDao.updateByUserIdCorpId(userId, corpId, validPoint, expiredPoint, freezingPoint);
			System.out.println("update succuss");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testQueryByUserIdCorpId()
	{
		System.out.println("testQueryByUserIdCorpId");
		int userId = 6;
		int corpId = 1;
		try
		{
			Point userPoint = pointDao.queryByUserIdCorpId(userId, corpId);
			System.out.println("QueryByUserIdCorpId succ");
			System.out.println(userPoint.toString());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
