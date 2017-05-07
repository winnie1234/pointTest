package com.point.enums;

public enum PointCause {
	SignIn("SignIn"),
	trade("trade"),
	evaluate("evaluate"),
	exchange("exchange");
	
	private String name;
	
	public String getName()
	{
		return this.name;
	}
	
	private PointCause(String name)
	{
		this.name = name;
	}
	
	public boolean equals(String source)
	{
		if(name.equals(source))
		{
			return true;
		}
		else
			return false;
	}
}
