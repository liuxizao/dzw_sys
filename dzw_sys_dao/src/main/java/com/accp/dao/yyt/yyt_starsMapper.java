package com.accp.dao.yyt;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Stars;
/**
 * 
 * @author Yang Yu Tao
 *技工星级表
 */
public interface yyt_starsMapper {

	/**
	 * 查询技工的星级
	 * @return
	 */
	@Select("select * from stars where starts like '%${starts}%'")
	List<Stars> selectStarsAll(@Param("starts")String starts);
	
	/**
	 * 根据技工名称查询
	 * @param starts
	 * @return
	 */
	@Select("select * from stars where starts=#{starts}")
	Stars selectByName(@Param("starts")String starts);
}
