package com.point.enums;

public enum PointAction {
	Add("Add"),
	Minus("Minus"),
	Unfreeze("Unfreeze");
	
	private String name;
	
	public String getName()
	{
		return name;
	}
	
	private PointAction(String name)
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
		{
			return false;
		}
	}
	
}
