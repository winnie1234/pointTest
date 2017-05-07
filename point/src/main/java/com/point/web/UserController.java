package com.point.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.point.entity.User;
import com.point.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	private String list()
	{
		List<User> userList = userService.getUser();
		String ss = "";
		for(User user : userList)
		{
			ss = user.getId() + " " + user.getName() + " " + user.getAge();
		}
		return ss;
	}
}
