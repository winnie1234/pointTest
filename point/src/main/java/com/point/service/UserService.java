package com.point.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.point.dao.UserDao;
import com.point.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public List<User> getUser()
	{
		return userDao.queryAll();
	}
}
