package com.accp.dao.lt;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Employee;
import com.accp.pojo.Tblfunction;
import com.accp.pojo.Tblperm;
import com.accp.pojo.Zhiwei;

public interface LoginDao {
	
	//查询所有职位
	@Select("select * from zhiwei")
	List<Zhiwei> selZhiweiAll();

	//登陆查询用户信息且查询大节点
	Employee selLogin(@Param("phone")String phone,@Param("pwd")String pwd);
	
	//查询小的节点
	@Select("SELECT f.* FROM tbl_perm t INNER JOIN tbl_function f ON t.fid=f.fpid WHERE zid=#{zid} AND f.fpid=#{fid}")
	List<Tblfunction> selXiao(@Param("zid")Integer zid,@Param("fid")Integer fid);
	
	//查询节点
	@Select("SELECT * FROM tbl_function WHERE fpid=#{fpid}")
	List<Tblfunction> selDadian(@Param("fpid")Integer fpid);
	
	//按职位查询权限
	@Select("select * from tbl_perm where zid=#{zid}")
	List<Tblperm> selTblperm(@Param("zid")Integer zid);
	
	//查询今日维修数据
	int selWeixiu(@Param("iszn")Integer iszn);
	
	//删除职位权限
	@Delete("DELETE FROM tbl_perm WHERE zid =#{zid}")
	int delZhiwei(@Param("zid")Integer zid);
	
	//新增职位权限
	@Insert("INSERT INTO tbl_perm VALUES(#{zid}, #{fid})")
	int insTblperm(@Param("zid")Integer zid,@Param("fid")Integer fid);
	
	//统计今日入账金额
	@Select("SELECT SUM(shisprice) FROM cashiers WHERE paymenttemp=#{paymenttemp} AND casdate=#{casdate}")
	Float selshisprice(@Param("paymenttemp")String paymenttemp,@Param("casdate")String casdate);
	
	@Select("SELECT SUM(shisprice) FROM cashiers WHERE casdate=#{casdate}")
	Float selSum(@Param("casdate")String casdate);
	
	@Select("SELECT COUNT(shisprice) FROM cashiers WHERE casdate=#{casdate}")
	int selCount(@Param("casdate")String casdate);
}
