package com.point.service;

import java.sql.Timestamp;
import java.util.Date;

import com.point.dto.PointOpExecution;
import com.point.entity.Point;
import com.point.entity.Pointlist;

public interface AdminService {

	PointOpExecution AddOnePointRecord(int userId,int corpId,
			String action, String status, int point, String  description,
			Timestamp dealDate,int dealId,String dealType,Timestamp pointActionDate);
}
