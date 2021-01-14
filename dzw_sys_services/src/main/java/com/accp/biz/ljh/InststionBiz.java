package com.accp.biz.ljh;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.InststionMapper;
import com.accp.dao.ljh.ljh_InststionMapper;
import com.accp.pojo.Employee;
import com.accp.pojo.Inststion;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 维修信息表
 * @author 321
 *
 */
@Service
public class InststionBiz {

	@Autowired
	ljh_InststionMapper ljhMapper; //柳佳辉mapper
	@Autowired
	InststionMapper mapper;//公共mapper
	
	
	public PageInfo<Inststion> findAllByInststion(String cno,Integer izt,String string,String string2,
			Integer size,Integer num){
		PageHelper.startPage(num, size);
		return new PageInfo<Inststion>(ljhMapper.queryAll(cno, izt, string, string2));
	}
	

	/**
	 * 新增
	 * @param i
	 * @return
	 */
	public int insertInststion(Inststion i) {
		return mapper.insertSelective(i);
	}
	
}
