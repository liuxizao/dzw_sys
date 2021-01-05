package com.accp.biz.yyt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.ArtisanMapper;
import com.accp.dao.yyt.yyt_ArtisanMapper;
import com.accp.dao.yyt.yyt_fangongMapper;
import com.accp.dao.yyt.yyt_instsionMapper;
import com.accp.pojo.Artisan;
import com.accp.pojo.Inststion;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
	@Autowired
	private yyt_instsionMapper yytinstsionMapper;//维修
	@Autowired
	private yyt_fangongMapper yytfangongMapper;//返工
	
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
	public PageInfo<Artisan> selectByTid(Artisan a,Integer currentPage,Integer size){
		PageHelper.startPage(currentPage, size);
		return new PageInfo<Artisan>(yytMapper.selectByTid(a));
	}
	
	/**
	 * 新增
	 * @param a
	 * @return
	 */
	public int insertArtisan(Artisan a) {
		return yytMapper.insertArtisan(a);
	}
	
	/**
	 * 修改
	 * @param a
	 * @return
	 */
	public int updateArtisan(Artisan a) {
		//System.out.println(a.getAphone());
		List<Inststion> slist= yytinstsionMapper.selectByTid(a.getAphone());//查询是否在维修
		Integer	i=0;
		for (Inststion inststion : slist) {
			i= yytfangongMapper.selectByInid(inststion.getInid());
		}
		if(slist.size()==0&&i==0) {
			return mapper.updateByPrimaryKeySelective(a);
		}else {
			return 2;
		}
	}
	
	/**
	 * 删除
	 * @param aphone
	 * @return
	 */
	public int deleteArtisan(String aphone) {
		List<Inststion> slist= yytinstsionMapper.selectByTid(aphone);//查询是否在维修
		Integer	a=0;
		for (Inststion inststion : slist) {
			a= yytfangongMapper.selectByInid(inststion.getInid());
		}
		if(slist.size()==0&&a==0) {
			return mapper.deleteByPrimaryKey(aphone);
		}else {
			return 2;
		}
		
	}
	
	/**
	 * 查询当前班组是否有组长
	 * @param tid
	 * @return
	 */
	public String selectByZid(Integer tid) {
		return yytMapper.selectByZid(tid);
	}
	
	/**
	 * 根据手机号码查询
	 * @param aphone
	 * @return
	 */
	public Artisan selectByPhone(String aphone) {
		return mapper.selectByPrimaryKey(aphone);
	}
}
