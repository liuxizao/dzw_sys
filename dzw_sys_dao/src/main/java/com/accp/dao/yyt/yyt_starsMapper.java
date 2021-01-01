package com.accp.dao.yyt;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Stars;
/**
 * 
 * @author Yang Yu Tao
 *�����Ǽ���
 */
public interface yyt_starsMapper {

	/**
	 * ��ѯ�������Ǽ�
	 * @return
	 */
	@Select("select * from stars where starts like '%${starts}%'")
	List<Stars> selectStarsAll(@Param("starts")String starts);
	
	/**
	 * ���ݼ������Ʋ�ѯ
	 * @param starts
	 * @return
	 */
	@Select("select * from stars where starts=#{starts}")
	Stars selectByName(@Param("starts")String starts);
}
