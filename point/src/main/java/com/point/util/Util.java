package com.point.util;

public class Util {

	public static java.sql.Timestamp convertFromUtilDateToSqlTimestamp(java.util.Date dateSource)
	{
		java.sql.Timestamp result = new java.sql.Timestamp(dateSource.getTime());
		return result;
	}
}
