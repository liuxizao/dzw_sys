package com.accp.dao.ljh;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Inststion;

public interface ljh_InststionMapper {
	
	/**
	 * 根据条件查询维修表
	 * @param con 客户车牌号
	 * @param izt 车辆的状态 0：维修中 1：接车中 2：返工 3：已竣工
	 * @param date 进厂开始时间
	 * @param date2	进厂结束时间
	 * @return
	 */
	List<Inststion> queryAll(@Param("cno") String cno,@Param("izt") Integer izt,
			@Param("jdateStart") String jdateStart,@Param("jdateEnd") String jdateEnd);
}
