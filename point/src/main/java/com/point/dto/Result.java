package com.point.dto;

import com.point.enums.PointOpStatus;

public class Result<T> {
	
	private PointOpStatus status;
	
	private T data;
	
	private String err;
	
	public Result(PointOpStatus status, String err)
	{
		this.err = err;
		this.status = status;
	}
	
	public Result(PointOpStatus status, T data)
	{
		this.data = data;
		this.status = status;
	}
	
	public PointOpStatus getStatus()
	{
		return this.status;
	}
	
	public void setStatus(PointOpStatus status)
	{
		this.status = status;
	}
	
	public T getData()
	{
		return this.data;
	}
	
	public void setData(T data)
	{
		this.data = data; 
	}
	
	public String getErr()
	{
		return this.err;
	}
	
	public void setErr(String err)
	{
		this.err = err;
	}

}
