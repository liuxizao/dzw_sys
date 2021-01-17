package com.accp.dao.lt;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Cartypes;
import com.accp.pojo.Client;
import com.accp.pojo.Clientcar;
import com.accp.pojo.Employee;

public interface LtClientDao {

	//��ѯ�����û���Ϣ
	@Select("SELECT * FROM CLIENT")
	List<Client> selClientAll();
	
	//���ֻ��Ų�ѯ�û�
	@Select("SELECT * FROM CLIENT where cliphone like '%${phone}%'")
	List<Client> selCliphone(@Param("phone") String phone);
	
	//��ѯ����Ʒ��
	@Select("SELECT * FROM cartypes")
	List<Cartypes> selCartype();
	
	//��ѯ�Ӵ���Ա
	@Select("SELECT * FROM employee WHERE zid=8")
	List<Employee> selEmpljiedai();
}
