package com.accp.biz.yyt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.StarsMapper;
import com.accp.dao.yyt.yyt_starsMapper;
import com.accp.pojo.Stars;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Yang Yu Tao 技工星级表业
 */
@Service
public class starsBiz {

	@Autowired
	private yyt_starsMapper yytMapper;// yytmapper
	@Autowired
	private StarsMapper mapper;// 公共mapper

	/**
	 * 根据名称查询
	 * 
	 * @param name
	 * @return
	 */
	public Stars selectByName(String starts) {
		return yytMapper.selectByName(starts);
	}

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public PageInfo<Stars> selectStarsAll(String starts, Integer size, Integer currentPage) {
		PageHelper.startPage(currentPage, size);
		return new PageInfo<Stars>(yytMapper.selectStarsAll(starts));
	}

	/**
	 * 新增
	 * 
	 * @param stars
	 * @return
	 */
	public int insertStars(Stars stars) {
		return mapper.insertSelective(stars);
	}

	/**
	 * 修改
	 * 
	 * @param stars
	 * @return
	 */
	public int updateStars(Stars stars) {
		return mapper.updateByPrimaryKeySelective(stars);
	}

	/**
	 * 删除
	 * 
	 * @param sid
	 * @return
	 */
	public int deleteStars(Integer sid) {
		return mapper.deleteByPrimaryKey(sid);
	}

	/**
	 * 根据id查询
	 * 
	 * @param sid
	 * @return
	 */
	public Stars sletectById(Integer sid) {
		return mapper.selectByPrimaryKey(sid);
	}

}
