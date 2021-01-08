package com.accp.biz.yyt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.ArtisanMapper;
import com.accp.dao.yyt.yyt_ArtisanMapper;
import com.accp.pojo.Artisan;
/**
 * 
 * @author Yang Yu Tao
 *技工表
 */
@Service
public class artisanBiz {

	@Autowired
	private yyt_ArtisanMapper yytMapper;//yyt
	@Autowired
	private ArtisanMapper mapper;//公共的
	
	/**
	 * 查询所有技工
	 * @return
	 */
	public List<Artisan> selectAll(){
		return yytMapper.selectAll();
	}
	
	/**
	 * 根据班组查询技工
	 * @param tid
	 * @return
	 */
	public List<Artisan> selectByTid(Artisan a){
		return yytMapper.selectByTid(a);
	}
}
