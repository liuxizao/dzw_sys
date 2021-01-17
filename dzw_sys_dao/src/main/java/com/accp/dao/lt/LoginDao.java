package com.accp.dao.lt;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Employee;
import com.accp.pojo.Tblfunction;
import com.accp.pojo.Tblperm;

public interface LoginDao {

	//��½��ѯ�û���Ϣ�Ҳ�ѯ��ڵ�
	Employee selLogin(@Param("phone")String phone,@Param("pwd")String pwd);
	
	//��ѯС�Ľڵ�
	@Select("SELECT f.* FROM tbl_perm t INNER JOIN tbl_function f ON t.fid=f.fpid WHERE zid=#{zid} AND f.fpid=#{fid}")
	List<Tblfunction> selXiao(@Param("zid")Integer zid,@Param("fid")Integer fid);
}
