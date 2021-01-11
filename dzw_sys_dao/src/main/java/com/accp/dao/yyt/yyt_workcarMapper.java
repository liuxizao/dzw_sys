package com.accp.dao.yyt;
/**
 * 
 * @author Yang Yu Tao
 *���ڳ�����
 */

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Workcar;

public interface yyt_workcarMapper {
	
	/**
	 * ��������ѯ
	 * @return
	 */
	List<Workcar> selectWorkccarAll(Workcar record);
	
	/**
	 * ���ݳ��ƺŲ�ѯ
	 * @param caid
	 * @return
	 */
	@Select("select count(*) from workcar where caid=#{caid}")
	int selectByCaid(@Param("caid")String caid);
}
