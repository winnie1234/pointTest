package com.point.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.point.service.CommonService;

@Controller
@RequestMapping("/common")
public class CommonController {
	
	@Autowired
	private CommonService commonService;

//	@RequestMapping(value = "/PointList", method = RequestMethod.Get)
//	private String getPointByUser()
//	{
//		commonService.getPointByUserId(userId, comanpyId);
//	}
}
