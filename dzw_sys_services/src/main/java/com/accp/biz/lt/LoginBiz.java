package com.accp.biz.lt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.lt.LoginDao;
import com.accp.pojo.Employee;
import com.accp.pojo.Tblfunction;
import com.accp.pojo.Tblperm;

@Service
public class LoginBiz {

	@Autowired
	private LoginDao login;
	
	//登陆且查询大节点
	public Employee selLogin(String phone,String pwd) {
		return login.selLogin(phone, pwd);
	}
	
	//查询小节点
	public List<Tblfunction> selXiao(Integer zid,Integer fid) {
		return login.selXiao(zid,fid);
	}
}
