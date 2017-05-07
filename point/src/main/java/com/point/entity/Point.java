package com.point.entity;

import java.sql.Timestamp;

/**
	*@author 
	*@since 2017-03-18 22:51:21
	*/

public class Point{

	private int id;
	private int userId;
	private int corpId;
	// total point
	private int point;
	private Timestamp createDate;
	private Timestamp updateDate;
	private int validPoint;
	private int expiredPoint;
	private int freezingPoint;
	
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getCorpId()
	{
		return this.corpId;
	}
	
	public void setCorpId(int corpId)
	{
		this.corpId = corpId;
	}
	public int getValidPoint()
	{
		return validPoint;
	}
	
	public void setValidPoint(int m_ValidPoint)
	{
		validPoint = m_ValidPoint;
	}
	
	public int getExpiredPoint()
	{
		return expiredPoint;
	}
	
	public void setExpiredPoint(int m_expiredPoint)
	{
		expiredPoint = m_expiredPoint;
	}
	
	public int getFreezingPoint()
	{
		return freezingPoint;
	}
	
	public void setfreezingPoint(int m_freezingPoint)
	{
		freezingPoint = m_freezingPoint;
	}
	
	public int getUserId(){
		return this.userId;
	}
	
	public void setUserId(int userId){
		this.userId=userId;
	}
	
	public int getPoint(){
		return this.point;
	}
	
	public void setPoint(int point){
		this.point=point;
	}
	
	public Timestamp getCreateDate(){
		return this.createDate;
	}
	
	public void setCreateDate(Timestamp createDate){
		this.createDate = createDate;
	}
	
	public Timestamp getUpdateDate(){
		return this.updateDate;
	}
	
	public void setUpdateDate(Timestamp updateDate){
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "Point [id=" + id + ", userId=" + userId + ", corpId=" + corpId + ", point=" + point + ", createDate="
				+ createDate + ", updateDate=" + updateDate + ", validPoint=" + validPoint + ", expiredPoint="
				+ expiredPoint + ", freezingPoint=" + freezingPoint + "]";
	}
	
}