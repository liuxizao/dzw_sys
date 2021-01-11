package com.accp.biz.tzy;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.dao.tzy.tzy_CartypesMapper;
import com.accp.pojo.Cartypes;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class tzy_CartypesBiz {
	@Resource
	private tzy_CartypesMapper tzycm;
	
	/**
	 * 查询全部车辆品牌
	 * @return
	 */
	public List<Cartypes> querycar(){
		return tzycm.querycar();
	}
	
	/**
	 * 分页查询全部车辆品牌
	 * @return
	 */
	public PageInfo<Cartypes> querycartypes(String carname,Integer p,Integer s){
		if(carname.equals("null")) { carname=null; }
		PageHelper.startPage(p, s);
		return new PageInfo<Cartypes>(tzycm.querycartypes(carname));
	}
	/**
	 * 添加车辆品牌
	 * @param car
	 * @return
	 */
	public int inscar(Cartypes car) {
		return tzycm.insertSelective(car);
	}
	
	/**
	 * 删除车辆品牌
	 * @param ctid
	 * @return
	 */
	public int delcar(Integer ctid) {
		return tzycm.deleteByPrimaryKey(ctid);
	}
	
	/**
	 * 修改车辆品牌
	 * @param car
	 * @return
	 */
	public int updcar(Cartypes car) {
		return tzycm.updateByPrimaryKeySelective(car);
	}
}
