package com.accp.dao.yyt;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 
 * @author Yang Yu Tao
 *������
 */
public interface yyt_fangongMapper {

	/**
	 * ��ѯ��ǰ�����Ƿ��ڷ���
	 * @param inid
	 * @return
	 */
	@Select("select count(*) from fangong where fzt<>0 and inid=#{inid}")
	int selectByInid(@Param("inid") Integer inid);
}
