package com.accp.dao.yyt;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Inststion;
/**
 * 
 * @author Yang Yu Tao
 *ά�ޱ�
 */
public interface yyt_instsionMapper {

	/**
	 * ���ݼ����ֻ������ѯά�ޱ�
	 * @param aphone
	 * @return
	 */
	@Select("SELECT * FROM inststion WHERE tid ="
			+ "(SELECT tid FROM Artisan WHERE aphone=#{aphone} AND `ifjs`<>0)")
	List<Inststion> selectByTid(@Param("aphone") String aphone);
}
