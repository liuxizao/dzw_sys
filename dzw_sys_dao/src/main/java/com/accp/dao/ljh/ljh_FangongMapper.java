package com.accp.dao.ljh;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ljh_FangongMapper {

	@Select("select count(*) from fangong where inid=#{inid}")
	int selectNum(@Param("inid") String inid);
}
