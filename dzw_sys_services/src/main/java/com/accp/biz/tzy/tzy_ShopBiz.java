package com.accp.biz.tzy;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.accp.dao.ShopMapper;
import com.accp.dao.tzy.tzy_CartypesMapper;
import com.accp.dao.tzy.tzy_FirmMapper;
import com.accp.dao.tzy.tzy_ShopMapper;
import com.accp.pojo.Cartypes;
import com.accp.pojo.Firm;
import com.accp.pojo.Shop;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class tzy_ShopBiz {
	@Resource
	private ShopMapper sm;
	@Resource
	private tzy_ShopMapper tzysm;

	/**
	 * 查询维修项目
	 * 
	 * @param p
	 * @param s
	 * @return
	 */
	public PageInfo<Shop> queryAA(Integer p, Integer s) {
		PageHelper.startPage(p, s);
		return new PageInfo<Shop>(tzysm.queryAA());
	}

	/**
	 * 查询所有发动机
	 * 
	 * @return
	 */
	public PageInfo<Shop> queryshopfdj(String shopname, Integer p, Integer s) {
		if (shopname.equals("null")) {
			shopname = null;
		}
		PageHelper.startPage(p, s);
		return new PageInfo<Shop>(tzysm.queryshopfdj(shopname));
	}

	/**
	 * 添加发动机
	 * 
	 * @param fdj
	 * @return
	 */
	public int insshopfdj(Shop sp) {
		return tzysm.addshopfdj(sp);
	}

	/**
	 * 删除发动机
	 * 
	 * @param shopid
	 * @return
	 */
	public int delshopfdj(int shopid) {
		return sm.deleteByPrimaryKey(shopid);
	}

	/**
	 * 修改
	 * 
	 * @param record
	 * @return
	 */
	public int updshopfdj(Shop record) {
		return sm.updateByPrimaryKeySelective(record);
	}

	/**
	 * 查询所有保养项目
	 * 
	 * @return
	 */
	public PageInfo<Shop> queryshopby(String byname, Integer p, Integer s) {
		if (byname.equals("null")) {
			byname = null;
		}
		PageHelper.startPage(p, s);
		return new PageInfo<Shop>(tzysm.queryshopby(byname));
	}

	/**
	 * 查询所有维修项目
	 * 
	 * @return
	 */
	public PageInfo<Shop> queryshopwx(String wxname, Integer p, Integer s) {
		if (wxname.equals("null")) {
			wxname = null;
		}
		PageHelper.startPage(p, s);
		return new PageInfo<Shop>(tzysm.queryshopwx(wxname));
	}
}
