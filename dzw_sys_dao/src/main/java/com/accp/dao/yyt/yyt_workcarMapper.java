package com.accp.dao.yyt;
/**
 * 
 * @author Yang Yu Tao
 *外勤车辆表
 */

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Workcar;

public interface yyt_workcarMapper {
	
	/**
	 * 待条件查询
	 * @return
	 */
	List<Workcar> selectWorkccarAll(Workcar record);
	
	/**
	 * 根据车牌号查询
	 * @param caid
	 * @return
	 */
	@Select("select count(*) from workcar where caid=#{caid}")
	int selectByCaid(@Param("caid")String caid);
}
