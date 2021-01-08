package com.accp.dao.yyt;
/**
 * 
 * @author Yang Yu Tao
 *������
 */

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Artisan;

public interface yyt_ArtisanMapper {

	/**
	 * ��ѯ����
	 * @return
	 */
	@Select("select * from artisan")
	List<Artisan> selectAll();
	
	List<Artisan> selectByTid(Artisan record);
}
