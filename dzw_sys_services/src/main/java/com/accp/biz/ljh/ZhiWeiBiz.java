package com.accp.biz.ljh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.StarsMapper;
import com.accp.dao.ZhiweiMapper;
import com.accp.dao.ljh.ljh_zhiweiMapper;
import com.accp.dao.yyt.yyt_starsMapper;
import com.accp.pojo.Stars;
import com.accp.pojo.Zhiwei;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Liu Jia Hui
 *员工职位表
 */
@Service
public class ZhiWeiBiz {

	@Autowired
	private ljh_zhiweiMapper ljhMapper;//ljhmapper
	@Autowired
	private ZhiweiMapper mapper;//公共mapper
	
	/**
	 * 查询所有
	 * @return
	 */
	public PageInfo<Zhiwei> selectStarsAll(String zwname,Integer size,
			Integer currentPage){
		PageHelper.startPage(currentPage, size);
		return new PageInfo<Zhiwei>(ljhMapper.selectZhiWeiAll(zwname));
	}
	
	
	/**
	 * 新增
	 * @param stars 
	 * @return
	 */
	public int insertStars(Zhiwei zhiwei) {
		return mapper.insert(zhiwei);
	}
	
	/**
	 * 修改
	 * @param stars
	 * @return
	 */
	public int updateStars(Zhiwei zhiwei) {
		return mapper.updateByPrimaryKeySelective(zhiwei);
	}
	
	
	/**
	 * 删除
	 * @param sid
	 * @return
	 */
	public int deleteStars(Integer sid) {
		return mapper.deleteByPrimaryKey(sid);
	}
	
}
