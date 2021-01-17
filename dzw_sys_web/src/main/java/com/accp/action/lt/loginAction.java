package com.accp.action.lt;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lt.LoginBiz;
import com.accp.pojo.Employee;
import com.accp.pojo.Tblfunction;
import com.accp.pojo.Tblperm;
import com.accp.pojo.Wxxq;
import com.accp.pojo.Zhiwei;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping("/api/lt/login")
public class loginAction {

	@Resource
	private LoginBiz login;

	// 退出登录
		@GetMapping("/tui")
		public String selLogin(HttpSession session) {
			session.removeAttribute("USER");
			return "";
		}
	
	
	// 登陆且查询大节点
	@GetMapping("{phone}/{pwd}")
	public Employee selLogin(@PathVariable String phone, @PathVariable String pwd, HttpSession session) {
		System.out.println(phone);
		System.out.println(pwd);
		Employee user = login.selLogin(phone, pwd);
		if (user != null) {
			session.setAttribute("USER", phone);// 服务器保存
			return user;
		} else {
			return user;
		}
	}

	// 查询小节点
	@PostMapping("xiao/{fid}/{zid}")
	public List<Tblfunction> selXiao(@PathVariable Integer fid, @PathVariable Integer zid) {
		System.out.println(zid);
		return login.selXiao(zid, fid);
	}

	// 查询所有职位信息
	@PostMapping("zwall")
	public List<Zhiwei> selZhiweiAll() {
		return this.login.selZhiweiAll();
	}

	// 查询节点
	@PostMapping("quanx/{fpid}")
	public List<Tblfunction> selDadian(@PathVariable Integer fpid) {
		List<Tblfunction> tbl = this.login.selDadian(fpid);
		for (Tblfunction tblfunction : tbl) {
			tblfunction.setTblfunction(this.login.selDadian(tblfunction.getFid()));
		}
		return tbl;
	}

	// 按职位查询权限
	@PostMapping("zhiw/{zid}")
	public List<Tblperm> selTblperm(@PathVariable Integer zid) {
		return this.login.selTblperm(zid);
	}

	// 查询今日维修数据
	@PostMapping("sj/{iszn}")
	public int selWeixiu(@PathVariable Integer iszn) {
		System.out.println(iszn);
		return this.login.selWeixiu(iszn);
	}
	
	//修改职位权限信息
	@PostMapping("updZhiwei/{zid}")
	public int insTblperm(@PathVariable Integer zid,@RequestBody String zhiwei) {
		this.login.delZhiwei(zid);
		JSONArray array=JSONArray.parseArray(zhiwei);
		System.out.println(array);
		for (Object object : array) {
			this.login.insTblperm(zid, Integer.parseInt(object.toString()));
		}
		return 1;
	}
	
	//按条件查询今日入账统计
	@PostMapping("selshisprice")
	public double[] selshisprice() {
		double zhifb=(double)this.login.selshisprice("支付宝");
		double yue=(double)this.login.selshisprice("余额");
		double xj=(double)this.login.selshisprice("现金");
		double[] tj=new double[3];
		tj[0]=zhifb;
		tj[1]=yue;
		tj[2]=xj;
		return tj;
	}
	
	@PostMapping("selCount")
	public int selCount() {
		return this.login.selCount();
	}
	
	@PostMapping("selSum")
	public Float selSum() {
		return this.login.selSum();
	}
}
