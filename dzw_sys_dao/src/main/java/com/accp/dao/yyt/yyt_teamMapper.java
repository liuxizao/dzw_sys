package com.accp.dao.yyt;
/**
 * 
 * @author Yang Yu Tao
 *���������
 */

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Team;

public interface yyt_teamMapper {

	/**
	 * ��ѯ����	�����ѯ������
	 * @return
	 */
	List<Team> selectTeamAll();
	
	/**
	 * ��ѯ����
	 * @return
	 */
	@Select("select * from team")
	List<Team> selectTeam();
	
	/**
	 * �������Ʋ�ѯ
	 * @param name
	 * @return
	 */
	@Select("select * from team where tname=#{name}")
	Team selectByName(@Param("name")String name);
	
	/**
	 * ����״̬��ѯ��ǰ����
	 * @return
	 */
	@Select("SELECT * FROM team AS t WHERE t.tzhuant=0 AND "
			+ "(SELECT COUNT(*) FROM artisan WHERE tid=t.`tid`)<>0")
	List<Team> selectByZt();
	
}
