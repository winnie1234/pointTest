package com.point.web;

import java.nio.ByteBuffer;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.point.service.AdminService;
import com.point.source.data.DealEntity;
import com.point.util.Util;

@Controller
@RequestMapping("/user")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@RequestMapping(value = "/point", method = RequestMethod.GET)
	@ResponseBody
	public void insrtPoint(DealEntity source)
	{
		adminService.AddOnePointRecord(source.corpId, 
				source.dealId, 
				source.pointAction.getName(), 
				source.pointStatus.getName(), 
				source.point, 
				source.description, 
				Util.convertFromUtilDateToSqlTimestamp(source.dealDate), 
				source.dealId, 
				source.pointCause.getName(),
				Util.convertFromUtilDateToSqlTimestamp(new Date()));
		
		//ByteBuffer u;
	}
}
