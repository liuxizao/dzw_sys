package com.accp.biz.lt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.ClientcarMapper;
import com.accp.dao.lt.LtClientcarDao;
import com.accp.pojo.Clientcar;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ClientcarBiz {

	@Autowired
	private LtClientcarDao clicardao;
	@Autowired
	private ClientcarMapper clicar;

	// 按车牌号修改车辆信息
	public int updateByPrimaryKeySelective(Clientcar record) {
		return this.clicar.updateByPrimaryKeySelective(record);
	}

	// 按手机号查询车辆
	public List<Clientcar> selClientcarPhone(String phone) {
		return this.clicardao.selClientcarPhone(phone, null);
	}

	// 按手机号查询车辆
	public PageInfo<Clientcar> selCarcno(Integer pageNum, Integer pageSize, String cno) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Clientcar>(this.clicardao.selClientcarPhone(null, cno));
	}

	// 新增车辆信息
	public int insclicar(Clientcar cli) {
		return this.clicar.insertSelective(cli);
	}

	// 删除车辆信息
	public int delCliphone(String phone) {
		return this.clicardao.delCliphone(phone);
	}

	// 根据车牌号删除车辆信息
	public int deleteByPrimaryKey(String cno) {
		return this.clicar.deleteByPrimaryKey(cno);
	}
}
