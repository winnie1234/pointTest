package com.point.entity;

	/**
	*此类由GenerateBean工具自动生成

	*@author 
	*@since 2017-03-18 22:51:21
	*/

	public class User{
		
	

	private int id;
	private String name;
	private int age;
	private int corpId;
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public int getCorpId()
	{
		return this.corpId;
	}
	
	public void setCorpId(int corpId)
	{
		this.corpId = corpId;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", corpId=" + corpId + "]";
	}
}