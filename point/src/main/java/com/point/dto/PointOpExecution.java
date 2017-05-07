package com.point.dto;

import com.point.entity.Point;
import com.point.enums.PointOpStatus;

public class PointOpExecution {

	private int userId;
	
	private int corpId;
	
	private PointOpStatus status;
	
	private Point point;
	
	private String exceptionMsg;
	
//	private int point;
//	
//	private int totalPoint;
//	
	public PointOpExecution()
	{
		
	}
	
	public PointOpExecution(int userId,int corpId,PointOpStatus status)
	{
		this.userId = userId;
		this.corpId = corpId;
		this.status = status;
	}
	
	public PointOpExecution(int userId,int corpId,PointOpStatus status,String exceptionMsg)
	{
		this.userId = userId;
		this.corpId = corpId;
		this.status = status;
		this.exceptionMsg = exceptionMsg;
	}
	
	public PointOpExecution(int userId,int corpId,PointOpStatus status,Point point)
	{
		this.userId = userId;
		this.corpId = corpId;
		this.status = status;
		this.point = point;
	}
	
	public String getExceptionMsg()
	{
		return this.exceptionMsg;
	}
	
	public void setExceptionMsg(String exceptionMsg)
	{
		this.exceptionMsg = exceptionMsg;
	}
	
	public Point getPoint()
	{
		return this.point;
	}
	
	public void setPoint(Point point)
	{
		this.point = point;
	}
	
	public int getUserId()
	{
		return userId;
	}
	
	public void setUserId(int userId)
	{
		this.userId = userId;
	}
	
	public int getCorpId()
	{
		return this.corpId;
	}
	
	public void setCorpId(int corpId)
	{
		this.corpId = corpId;
	}
	
	public PointOpStatus getStatus()
	{
		return this.status;
	}
	
	public void setStatus(PointOpStatus status)
	{
		this.status = status;
	}
//	
//	public int getPoint()
//	{
//		return this.point;
//	}
//	
//	public void setPoint(int point)
//	{
//		this.point = point;
//	}
//	
//	public int getTotalPoint()
//	{
//		return this.totalPoint;
//	}
//	
//	public void setTotalPoint(int totalPoint)
//	{
//		this.totalPoint = totalPoint;
//	}
}
