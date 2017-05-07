package com.point.dao;

import java.sql.Timestamp;

import org.apache.ibatis.annotations.Param;

import com.point.entity.Pointlist;

public interface PointListDao {

	//select number
	int selectSeqCountByUserIdCorpId(@Param("userId") int userId,
									@Param("corpId") int corpId);
	
	// insert
	int insert(@Param("userId") int userId,
			@Param("corpId") int corpId,
			@Param("seq") int seq,
			@Param("action") String action,
			@Param("status") String status,
			@Param("point") int point,
			@Param("description") String description,
			@Param("dealDate") Timestamp dealDate,
			@Param("dealId") int dealId,
			@Param("dealType") String dealType,
			@Param("pointActionDate") Timestamp pointActionDate);
	
	// select by user
	Pointlist selectByUserId(@Param("userId") int userId);
	
	// select all
	Pointlist selectAll();
	
}
