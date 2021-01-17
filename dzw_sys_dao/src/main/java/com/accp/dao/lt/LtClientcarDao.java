package com.accp.dao.lt;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Clientcar;

public interface LtClientcarDao {

	//查询所有用户车辆
	List<Clientcar> selClientcarPhone(@Param("phone")String phone,@Param("cno")String cno);
	
	//根据手机号删除车辆信息
	@Delete("DELETE FROM clientcar WHERE cliphone=#{phone}")
	int delCliphone(@Param("phone")String phone);
	
	
}
