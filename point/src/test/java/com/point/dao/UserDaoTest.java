package com.point.dao;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.point.BaseTest;
import com.point.entity.User;

public class UserDaoTest extends BaseTest {

	@Autowired
	private UserDao userDao;
	
	@Test
	@Ignore
	public void testInsertUser()
	{
		System.out.println("testInsertUser");
		try
		{
			int id = 3;
			int age = 20;
			String name ="baby2";
			int corpId = 1;
			int index = userDao.insertUser(id, age, name, corpId);
			System.out.println(index);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testQueryByIdByCorpId()
	{
		System.out.println("testQueryByIdByCorpId");
		try
		{
			int id = 2;
			int corpId = 1;
			User user = userDao.queryByIdByCorpId(id, corpId);
			System.out.println("QueryByIdByCorpId succ");
			System.out.println(user.toString());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
