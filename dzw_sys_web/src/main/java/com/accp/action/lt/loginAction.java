package com.accp.action.lt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lt.LoginBiz;
import com.accp.pojo.Employee;
import com.accp.pojo.Tblfunction;
import com.accp.pojo.Tblperm;

@RestController
@RequestMapping("/api/lt/login")
public class loginAction {

	@Resource
	private LoginBiz login;

	// 登陆且查询大节点
	@GetMapping("{phone}/{pwd}")
	public Employee selLogin(@PathVariable String phone,@PathVariable String pwd,HttpSession session) {
		System.out.println(phone);
		System.out.println(pwd);
		Employee user=login.selLogin(phone, pwd);
		if (user != null) {
			session.setAttribute("USER", phone);// 服务器保存
			return user;
		} else {
			return user;
		}
	}

	// 查询小节点
	@PostMapping("xiao/{fid}/{zid}")
	public List<Tblfunction> selXiao(@PathVariable Integer fid,@PathVariable Integer zid) {
		System.out.println(zid);
		return login.selXiao(zid,fid);
	}
}
