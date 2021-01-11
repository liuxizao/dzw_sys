package com.accp.dao.lt;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Clientcar;

public interface LtClientcarDao {

	//��ѯ�����û�����
	List<Clientcar> selClientcarPhone(@Param("phone")String phone,@Param("cno")String cno);
	
	//�����ֻ���ɾ��������Ϣ
	@Delete("DELETE FROM clientcar WHERE cliphone=#{phone}")
	int delCliphone(@Param("phone")String phone);
	
	
}
