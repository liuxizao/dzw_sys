package com.accp.dao.yyt;
/**
 * 
 * @author Yang Yu Tao
 *������
 */

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Artisan;

public interface yyt_ArtisanMapper {

	/**
	 * ��ѯ����
	 * @return
	 */
	@Select("select * from artisan")
	List<Artisan> selectAll();
	
	List<Artisan> selectByTid(Artisan record);
	
	/**
	 * ��ѯ��ǰ�����Ƿ����鳤
	 * @param tid
	 * @return
	 */
	@Select("SELECT COUNT(*) FROM `artisan` WHERE tid=#{tid} AND zid=5")
	String selectByZid(@Param("tid")Integer tid);
	
	/*
	 * ����
	 */
	@Insert("insert into artisan (aphone, sid, zid, \r\n" + 
			"      tid, aname, asex, address, \r\n" + 
			"      acaid, acraft, azt, \r\n" + 
			"      alzyy, alzday, arzday)\r\n" + 
			"    values (#{aphone}, #{sid}, #{zid}, \r\n" + 
			"      #{tid}, #{aname}, #{asex}, #{address}, \r\n" + 
			"      #{acaid}, #{acraft}, #{azt}, \r\n" + 
			"      #{alzyy}, #{alzday}, NOW())")
	int insertArtisan(Artisan record);
	
}
