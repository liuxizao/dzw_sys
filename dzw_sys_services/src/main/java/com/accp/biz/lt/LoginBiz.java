package com.accp.biz.lt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.lt.LoginDao;
import com.accp.pojo.Employee;
import com.accp.pojo.Tblfunction;
import com.accp.pojo.Tblperm;
import com.accp.pojo.Zhiwei;

@Service
public class LoginBiz {

	@Autowired
	private LoginDao login;
	
	public int selCount() {
		return this.login.selCount(new SimpleDateFormat("yyyyMMdd").format(new Date()));
	}
	
	public Float selSum() {
		return this.login.selSum(new SimpleDateFormat("yyyyMMdd").format(new Date()));
	}
	
	//按条件查询今日入账统计
	public Float selshisprice(String zffs) {
		return this.login.selshisprice(zffs, new SimpleDateFormat("yyyyMMdd").format(new Date()));
	}
	
	//删除职位信息
	public int delZhiwei(Integer zid) {
		return this.login.delZhiwei(zid);
	}
	
	//删除职位信息
	public int insTblperm(Integer zid,Integer fid) {
		return this.login.insTblperm(zid,fid);
	}
	
	//查询今日维修数据
	public int selWeixiu(Integer iszn) {
		return this.login.selWeixiu(iszn);
	}
	
	//按职位查询权限
	public List<Tblperm> selTblperm(Integer zid){
		return this.login.selTblperm(zid);
	}
	
	//查询节点
	public List<Tblfunction> selDadian(Integer fpid){
		return this.login.selDadian(fpid);
	}
	
	//查询所有职位信息
	public List<Zhiwei> selZhiweiAll(){
		return this.login.selZhiweiAll();
	}
	

	// 登陆且查询大节点
	public Employee selLogin(String phone, String pwd) {
		return login.selLogin(phone, pwd);
	}

	// 查询小节点
	public List<Tblfunction> selXiao(Integer zid, Integer fid) {
		return login.selXiao(zid, fid);
	}
}
