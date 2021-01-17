package com.accp.biz.tzy;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.dao.tzy.tzy_FirmMapper;
import com.accp.pojo.Firm;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class tzy_FirmBiz {
	@Resource
	private tzy_FirmMapper tzyfm;

	/**
	 * 查询全部供应商
	 * 
	 * @return
	 */
	public PageInfo<Firm> queryfirm(String firmname, Integer p, Integer s) {

		if (firmname.equals("null")) {
			firmname = null;
		}

		PageHelper.startPage(p, s);
		return new PageInfo<Firm>(tzyfm.queryfirm(firmname));
	}

	/**
	 * 删除供应商
	 * 
	 * @param firmid
	 * @return
	 */
	public int delfirm(Integer firmid) {
		return tzyfm.deleteByPrimaryKey(firmid);
	}

	/**
	 * 添加供应商信息
	 * 
	 * @param record
	 * @return
	 */
	public int insfirm(Firm record) {
		return tzyfm.insertSelective(record);
	}

	/**
	 * 修改供应商
	 * 
	 * @param record
	 * @return
	 */
	public int updfirm(Firm record) {
		return tzyfm.updateByPrimaryKeySelective(record);
	}
}
