package com.common.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {

	public static Connection mssql(String url, String user, String pass){
		Connection conn = null;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			conn = DriverManager.getConnection(url, user, pass);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static Connection mysql(String url, String user, String pass)
			throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, user, pass);
		return conn; // 将连接对象返回
	}
	
	public static Connection mysql(String host, String database, String user,
			String pass) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://" + host + "/" + database
				+ "?useUnicode=true&characterEncoding=UTF-8";
		return mysql(url, user, pass);
	}

	public static ResultSet query(Connection conn, String sql) {
		ResultSet rs = null;
		try {
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs; 
	}

	/**
	 * 
	 * 
	 * @param sql
	 *           
	 * @return 
	 */
	public static int update(Connection conn, String sql) {
		Statement stmt = null;
		int i = 0;
		try {
			stmt = conn.createStatement();
			i = stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
	}
	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {

		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
