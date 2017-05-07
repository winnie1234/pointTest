package com.point.enums;

public enum PointOpStatus {
	Succ("Succ"),
	Unkown("Unkown"),
	AddFail("AddFail"),
	PointInsuff("PointInsuff"),
	NonUser("NonUser");
	
	private String name;
	
	private PointOpStatus(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
}
