package com.accp.dao.yyt;
/**
 * 
 * @author Yang Yu Tao
 *技工表
 */

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Artisan;

public interface yyt_ArtisanMapper {

	/**
	 * 查询所有
	 * @return
	 */
	@Select("select * from artisan")
	List<Artisan> selectAll();
	
	List<Artisan> selectByTid(Artisan record);
}
