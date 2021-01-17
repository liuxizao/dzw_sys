package com.accp.biz.yyt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.WorkcarMapper;
import com.accp.dao.yyt.yyt_workcarMapper;
/**
 * 
 * @author Yang Yu Tao
 *外勤车辆表
 */
import com.accp.pojo.Workcar;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class workcarBiz {

	@Autowired
	private yyt_workcarMapper yytMapper;// yyt
	@Autowired
	private WorkcarMapper mapper;// 公共

	/**
	 * 查询
	 * 
	 * @param w
	 * @return
	 */
	public PageInfo<Workcar> selectWorkcarAll(Workcar w, Integer size, Integer currentPage) {
		PageHelper.startPage(currentPage, size);
		return new PageInfo<Workcar>(yytMapper.selectWorkccarAll(w));
	}

	/**
	 * 新增
	 * 
	 * @param w
	 * @return
	 */
	public int insertWorkcar(Workcar w) {
		return mapper.insertSelective(w);
	}

	/**
	 * 删除
	 * 
	 * @param wid
	 * @return
	 */
	public int deleteWorkcar(Integer wid) {
		return mapper.deleteByPrimaryKey(wid);
	}

	/**
	 * 修改
	 * 
	 * @param w
	 * @return
	 */
	public int updateWorkcar(Workcar w) {
		return mapper.updateByPrimaryKeySelective(w);
	}

	/**
	 * 根据车牌号查询
	 * 
	 * @param caid
	 * @return
	 */
	public int selectByCaid(String caid) {
		return yytMapper.selectByCaid(caid);
	}

}
