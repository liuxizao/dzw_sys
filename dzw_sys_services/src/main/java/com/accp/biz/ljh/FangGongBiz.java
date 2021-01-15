package com.accp.biz.ljh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.FangongMapper;
import com.accp.dao.ljh.ljh_FangongMapper;
import com.accp.pojo.Fangong;

/**
 *返工表
 * @author 321
 *
 */
@Service
public class FangGongBiz {

	@Autowired
	FangongMapper dao;//返工表
	
	@Autowired
	ljh_FangongMapper ljhdao;//柳佳辉dao
	
	/**
	 *返工新增
	 * @param f
	 * @return
	 */
	public int insertFangGong(Fangong f) {
		return dao.insertSelective(f);
	}
	
	/**
	 * 返工次数
	 * @param inid
	 * @return
	 */
	public int findAll(String inid) {
		return ljhdao.selectNum(inid);
	}
	
}
