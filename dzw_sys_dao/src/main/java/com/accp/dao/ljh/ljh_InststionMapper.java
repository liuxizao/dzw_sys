package com.accp.dao.ljh;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Inststion;

public interface ljh_InststionMapper {
	
	/**
	 * ����������ѯά�ޱ�
	 * @param con �ͻ����ƺ�
	 * @param izt ������״̬ 0��ά���� 1���ӳ��� 2������ 3���ѿ���
	 * @param date ������ʼʱ��
	 * @param date2	��������ʱ��
	 * @return
	 */
	List<Inststion> queryAll(@Param("cno") String cno,@Param("izt") Integer izt,
			@Param("jdateStart") String jdateStart,@Param("jdateEnd") String jdateEnd);
}
