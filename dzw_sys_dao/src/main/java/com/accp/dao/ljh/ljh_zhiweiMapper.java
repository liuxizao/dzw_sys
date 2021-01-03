package com.accp.dao.ljh;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Zhiwei;
/**
 * 
 * @author Liu Jia Hui
 *Ա��ְλ�� 
 */
public interface ljh_zhiweiMapper {

	/**
	 * ��ѯְλ����Ϣ
	 * @return
	 */
	@Select("select * from zhiwei where zname like '${zwname}%'")
	List<Zhiwei> selectZhiWeiAll(@Param("zwname")String zwname);
	
	
}
