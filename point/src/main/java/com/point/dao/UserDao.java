package com.point.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.point.entity.User;

public interface UserDao {

	// insert 
	int insertUser(@Param("id") int id,
			@Param("age") int age,
			@Param("name") String name,
			@Param("corpId") int corpId);
	
	// query
	User queryByIdByCorpId(@Param("id") int id,@Param("corpId") int corpId);
	
	// delete
	void delete(@Param("id") int id);
	
	// update
	int update(@Param("id") int id,
			@Param("age") int age,
			@Param("name") String name);
	
	// query all
	List<User> queryAll();
	
}
