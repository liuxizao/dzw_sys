package com.accp.dao.yyt;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 
 * @author Yang Yu Tao
 *返工表
 */
public interface yyt_fangongMapper {

	/**
	 * 查询当前技工是否在返工
	 * @param inid
	 * @return
	 */
	@Select("select count(*) from fangong where fzt<>0 and inid=#{inid}")
	int selectByInid(@Param("inid") String inid);
}
