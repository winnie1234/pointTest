package com.point.service.Impl;

import java.sql.Timestamp;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.point.BaseTest;
import com.point.enums.PointAction;
import com.point.enums.PointStatus;
import com.point.service.AdminService;

public class AdminServiceImpTest extends BaseTest {
	
	@Autowired
	private AdminService adminiServiceImp;

	@Test
	public void testAddOnePointRecord()
	{
		System.out.println("testAddOnePointRecord");
		int userId = 6;
		int corpId = 1;
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
			adminiServiceImp.AddOnePointRecord(userId, corpId, action, status, point, description, dealDate, dealId, dealType, pointActionDate);
			System.out.println("AddOnePointRecord succ");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
