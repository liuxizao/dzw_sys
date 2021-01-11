package com.accp.action.lt;


import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lt.ClientBiz;
import com.accp.biz.lt.ClientcarBiz;
import com.accp.pojo.Cartypes;
import com.accp.pojo.Client;
import com.accp.pojo.Clientcar;
import com.accp.pojo.Employee;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/lt/cli")
public class ClientAction {

	@Resource
	private ClientBiz client;
	@Resource
	private ClientcarBiz clicar;

	// 查询所有用户
	@PostMapping("{p}/{z}/{cliphone}")
	public PageInfo<Client> selClientAll(@PathVariable Integer p,@PathVariable Integer z,@PathVariable String cliphone) {
		System.out.println(cliphone);
		return this.client.selClientAll(p,z,cliphone);
	}

	// 注册用户
	@PostMapping("insClient")
	public int insClient(@RequestBody Client client) {
		client.setClidate(new Date());
		return this.client.insertSelective(client);
	}

	// 注册会员and修改用户
	@PostMapping("zcandxg")
	public int updMid(@RequestBody Client client) {
		return this.client.updMid(client);
	}

	// 删除用户
	@PostMapping("delPhone/{phone}")
	public int delPhone(@PathVariable String phone) {
		this.clicar.delCliphone(phone);
		return this.client.delPhone(phone);
	}

	// 查询用户
	@PostMapping("selPhone/{phone}")
	public Client selPhone(@PathVariable String phone) {
		return this.client.selPhone(phone);
	}
	
	//查询车辆品牌
	@GetMapping("cartype")
	public List<Cartypes> selCartype(){
		return this.client.selCartype();
	}
	
	//查询接待人员
	@GetMapping("jiedai")
	public List<Employee> selEmpljiedai(){
		return this.client.selEmpljiedai();
	}
}
