package com.accp.dao.lt;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Cartypes;
import com.accp.pojo.Client;
import com.accp.pojo.Clientcar;
import com.accp.pojo.Employee;

public interface LtClientDao {

	//查询所有用户信息
	@Select("SELECT * FROM CLIENT")
	List<Client> selClientAll();
	
	//按手机号查询用户
	@Select("SELECT * FROM CLIENT where cliphone like '%${phone}%'")
	List<Client> selCliphone(@Param("phone") String phone);
	
	//查询车辆品牌
	@Select("SELECT * FROM cartypes")
	List<Cartypes> selCartype();
	
	//查询接待人员
	@Select("SELECT * FROM employee WHERE zid=8")
	List<Employee> selEmpljiedai();
	
}
