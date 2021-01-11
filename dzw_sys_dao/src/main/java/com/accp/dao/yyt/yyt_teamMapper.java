package com.accp.dao.yyt;
/**
 * 
 * @author Yang Yu Tao
 *技工班组表
 */

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Team;

public interface yyt_teamMapper {

	/**
	 * 查询所有	连表查询技工表
	 * @return
	 */
	List<Team> selectTeamAll();
	
	/**
	 * 查询所有
	 * @return
	 */
	@Select("select * from team")
	List<Team> selectTeam();
	
	/**
	 * 根据名称查询
	 * @param name
	 * @return
	 */
	@Select("select * from team where tname=#{name}")
	Team selectByName(@Param("name")String name);
	
}
