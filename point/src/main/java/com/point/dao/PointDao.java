package com.point.dao;

import java.sql.Date;
import java.sql.Timestamp;

import org.apache.ibatis.annotations.Param;
import com.point.entity.Point;;

public interface PointDao {
	
	// insert 
	int insert(@Param("userId") int userId,
			@Param("corpId") int corpId,
			//@Param("createDate") Timestamp createDate,
			//@Param("updateDate") Date updateDate,
			@Param("validPoint") int validPoint,
			@Param("expiredPoint") int expiredPoint,
			@Param("freezingPoint") int freezingPoint);
	
	// query
	Point queryByUserIdCorpId(@Param("userId") int userId,
							@Param("corpId") int corpId);
	
	// update
	int updateByUserIdCorpId(@Param("userId") int userId,
			@Param("corpId") int corpId,
			@Param("validPoint") int validPoint,
			@Param("expiredPoint") int expiredPoint,
			@Param("freezingPoint") int freezingPoint);
	
	// delete
	void deleteByUserId(@Param("userId") int userId);
}
