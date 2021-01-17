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
	
	//��ѯ����ְλ
	@Select("select * from zhiwei")
	List<Zhiwei> selZhiweiAll();

	//��½��ѯ�û���Ϣ�Ҳ�ѯ��ڵ�
	Employee selLogin(@Param("phone")String phone,@Param("pwd")String pwd);
	
	//��ѯС�Ľڵ�
	@Select("SELECT f.* FROM tbl_perm t INNER JOIN tbl_function f ON t.fid=f.fid WHERE t.zid=#{zid} AND t.fid>5 and f.fpid=#{fid}")
	List<Tblfunction> selXiao(@Param("zid")Integer zid,@Param("fid")Integer fid);
	
	//��ѯ�ڵ�
	@Select("SELECT * FROM tbl_function WHERE fpid=#{fpid}")
	List<Tblfunction> selDadian(@Param("fpid")Integer fpid);
	
	//��ְλ��ѯȨ��
	@Select("select * from tbl_perm where zid=#{zid}")
	List<Tblperm> selTblperm(@Param("zid")Integer zid);
	
	//��ѯ����ά������
	int selWeixiu(@Param("iszn")Integer iszn);
	
	//ɾ��ְλȨ��
	@Delete("DELETE FROM tbl_perm WHERE zid =#{zid}")
	int delZhiwei(@Param("zid")Integer zid);
	
	//����ְλȨ��
	@Insert("INSERT INTO tbl_perm VALUES(#{zid}, #{fid})")
	int insTblperm(@Param("zid")Integer zid,@Param("fid")Integer fid);
	
	//ͳ�ƽ������˽��
	@Select("SELECT SUM(shisprice) FROM cashiers WHERE paymenttemp=#{paymenttemp} AND casdate=#{casdate}")
	Float selshisprice(@Param("paymenttemp")String paymenttemp,@Param("casdate")String casdate);
	
	@Select("SELECT SUM(shisprice) FROM cashiers WHERE casdate=#{casdate}")
	Float selSum(@Param("casdate")String casdate);
	
	@Select("SELECT COUNT(shisprice) FROM cashiers WHERE casdate=#{casdate}")
	int selCount(@Param("casdate")String casdate);
}
