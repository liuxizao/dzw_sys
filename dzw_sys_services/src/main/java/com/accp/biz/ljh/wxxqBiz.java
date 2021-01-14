package com.accp.biz.ljh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.WxxqMapper;
import com.accp.pojo.Wxxq;

@Service
public class wxxqBiz {

	@Autowired
	private WxxqMapper mapper;//公共的
	
	/**
	 * 新增
	 * @param w
	 * @return
	 */
	public Integer insertWxxq(Wxxq w) {
		return mapper.insertSelective(w);
	}
}
