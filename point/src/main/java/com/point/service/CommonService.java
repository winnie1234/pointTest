package com.point.service;

import com.point.entity.Point;
import com.point.entity.Pointlist;

public interface CommonService {
	/**
	 * @Title: getPointByUserId
	 * @param use id
	 * @param tenant(company) id
	 * @return total point information
	 */
	Point getPointByUserId(int userId,int comanpyId);
	
	
	/**
	 * @Title: getPointlistByUserId
	 * @param user Id
	 * @param tenant(company) id
	 * @return: Pointlist
	 */
	Pointlist getPointlistByUserId(int userId,int comanpIdy);
}
