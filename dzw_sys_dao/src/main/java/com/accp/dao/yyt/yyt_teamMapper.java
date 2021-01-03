package com.accp.dao.yyt;
/**
 * 
 * @author Yang Yu Tao
 *���������
 */

import java.util.List;

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
	
}
