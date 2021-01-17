package com.accp.dao.lt;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Employee;
import com.accp.pojo.Tblfunction;
import com.accp.pojo.Tblperm;

public interface LoginDao {

	//登陆查询用户信息且查询大节点
	Employee selLogin(@Param("phone")String phone,@Param("pwd")String pwd);
	
	//查询小的节点
	@Select("SELECT f.* FROM tbl_perm t INNER JOIN tbl_function f ON t.fid=f.fpid WHERE zid=#{zid} AND f.fpid=#{fid}")
	List<Tblfunction> selXiao(@Param("zid")Integer zid,@Param("fid")Integer fid);
}
