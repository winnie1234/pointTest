package com.point.entity;

import java.sql.Timestamp;

/**
	*此类由GenerateBean工具自动生成

	*@author 
	*@since 2017-03-18 22:51:21
	*/

public class Pointlist{
	
	private int id;
	private int userId;
	private int corpId;
	private int seq;
	private String action;
	private String status;
	private int point;
	private String description;
	private Timestamp dealDate;
	private int dealId;
	private String dealType;
	private Timestamp pointActionDate;
	
	
	public Timestamp getPointActionDate()
	{
		return this.pointActionDate;
	}
	
	public void setPointActionDate(Timestamp pointActionDate)
	{
		this.pointActionDate = pointActionDate;
	}
	
	public int getCorpId()
	{
		return this.corpId;
	}
	
	public void setCorpId(int corpId)
	{
		this.corpId = corpId;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getSeq(){
		return this.seq;
	}
	
	public void setSeq(int seq){
		this.seq=seq;
	}
	
	public int getUserId(){
		return this.userId;
	}
	
	public void setUserId(int userId){
		this.userId=userId;
	}
	
	public String getAction(){
		return this.action;
	}
	
	public void setAction(String action){
		this.action=action;
	}
	
	public String getStatus(){
		return this.status;
	}
	
	public void setStatus(String status){
		this.status=status;
	}
	
	public int getPoint(){
		return this.point;
	}
	
	public void setPoint(int point){
		this.point=point;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public void setDescription(String description){
		this.description=description;
	}
	
	public Timestamp getDealDate(){
		return this.dealDate;
	}
	
	public void setDealDate(Timestamp dealDate){
		this.dealDate = dealDate;
	}
	
	public int getDealId(){
		return this.dealId;
	}
	
	public void setDealId(int dealId){
		this.dealId=dealId;
	}
	
	public String getDealType(){
		return this.dealType;
	}
	
	public void setDealType(String dealType){
		this.dealType=dealType;
	}

	@Override
	public String toString() {
		return "Pointlist [id=" + id + ", userId=" + userId + ", corpId=" + corpId + ", seq=" + seq + ", action="
				+ action + ", status=" + status + ", point=" + point + ", description=" + description + ", dealDate="
				+ dealDate + ", dealId=" + dealId + ", dealType=" + dealType + ", pointActionDate=" + pointActionDate
				+ "]";
	}

}