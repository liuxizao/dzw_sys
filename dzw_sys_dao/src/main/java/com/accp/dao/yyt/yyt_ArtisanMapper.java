package com.accp.dao.yyt;
/**
 * 
 * @author Yang Yu Tao
 *技工表
 */

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Artisan;

public interface yyt_ArtisanMapper {

	/**
	 * 查询所有
	 * @return
	 */
	@Select("select * from artisan")
	List<Artisan> selectAll();
	
	List<Artisan> selectByTid(Artisan record);
	
	/**
	 * 查询当前班组是否有组长
	 * @param tid
	 * @return
	 */
	@Select("SELECT COUNT(*) FROM `artisan` WHERE tid=#{tid} AND zid=5")
	String selectByZid(@Param("tid")Integer tid);
	
	/*
	 * 新增
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
