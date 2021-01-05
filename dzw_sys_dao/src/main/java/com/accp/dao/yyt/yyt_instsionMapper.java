package com.accp.dao.yyt;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Inststion;
/**
 * 
 * @author Yang Yu Tao
 *维修表
 */
public interface yyt_instsionMapper {

	/**
	 * 根据技工手机号码查询维修表
	 * @param aphone
	 * @return
	 */
	@Select("SELECT * FROM inststion WHERE tid ="
			+ "(SELECT tid FROM Artisan WHERE aphone=#{aphone} AND `ifjs`<>0)")
	List<Inststion> selectByTid(@Param("aphone") String aphone);
}
