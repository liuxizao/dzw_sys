package com.accp.dao.ljh;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Zhiwei;
/**
 * 
 * @author Liu Jia Hui
 *员工职位表 
 */
public interface ljh_zhiweiMapper {

	/**
	 * 查询职位的信息
	 * @return
	 */
	@Select("select * from zhiwei where zname like '%${zwname}%'")
	List<Zhiwei> selectZhiWeiAll(@Param("zwname")String zwname);

	/**
	 * 根据技工名称查询
	 * @param starts
	 * @return
	 */
	@Select("select * from zhiwei where zname=#{zname}")
	Zhiwei selectByName(String zname);
	
	
}
