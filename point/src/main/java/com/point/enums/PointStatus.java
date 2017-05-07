package com.point.enums;

public enum PointStatus {
	freeze("freeze"),
	expired("expired"),
	available("available"),
	other("other");
	
	private String name;
	
	private PointStatus(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public boolean equals(String source)
	{
		if(this.name().equals(source))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
