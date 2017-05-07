package com.point.entity;

public class Corp {

	private int id;
	private String corpName;
	private String corpFullName;
	private String corpType;
	
	public String getCorpType()
	{
		return this.corpType;
	}
	
	public void setCorpType(String corpType)
	{
		this.corpType = corpType;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getCorpName()
	{
		return this.corpName;
	}
	
	public void setCorpName(String corpName)
	{
		this.corpName = corpName;
	}
	
	public String getCorpFullName(String corpFullName)
	{
		return this.corpFullName;
	}
	
	public void setCorpFullName(String corpFullName)
	{
		this.corpFullName = corpFullName;
	} 
}
