package com.accp.biz.lt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.ClientMapper;
import com.accp.dao.lt.LtClientDao;
import com.accp.pojo.Cartypes;
import com.accp.pojo.Client;
import com.accp.pojo.Employee;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ClientBiz {

	@Autowired
	private ClientMapper cli;
	@Autowired
	private LtClientDao lcli;

	// 查询前台接待
	public List<Employee> selEmpljiedai() {
		return this.lcli.selEmpljiedai();
	}

	// 查询车辆品牌
	public List<Cartypes> selCartype() {
		return this.lcli.selCartype();
	}

	// 新增用户
	public int insertSelective(Client client) {
		return cli.insertSelective(client);
	}

	// 删除用户
	public int delPhone(String phone) {
		return cli.deleteByPrimaryKey(phone);
	}

	// 注册会员and修改用户
	public int updMid(Client client) {
		return cli.updateByPrimaryKeySelective(client);
	}

	// 查询所有用户
	public PageInfo<Client> selClientAll(Integer pageNum, Integer pageSize, String phone) {
		PageHelper.startPage(pageNum, pageSize);
		if ("undefined".equals(phone)) {
			return new PageInfo<Client>(this.lcli.selClientAll());
		} else {
			return new PageInfo<Client>(this.lcli.selCliphone(phone));
		}

	}

	// 查询用户
	public Client selPhone(String phone) {
		return cli.selectByPrimaryKey(phone);
	}
}
