package com.accp.action.ljh;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.BootstrapWith;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ljh.InststionBiz;
import com.accp.pojo.Employee;
import com.accp.pojo.Inststion;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Liu Jia Hui
 *维修信息表
 */
@RestController
@RequestMapping("/api/Wei")
public class InststionAction {

	@Autowired
	InststionBiz Inbiz;//维修业务	
	
	/**
	 * 查询所有
	 * @return
	 */
	@PostMapping("/all/{size}/{currentPage}")
	public PageInfo<Inststion> findEmpPageInfoAll(@RequestBody Map<String, Object> wei,
			@PathVariable Integer size,@PathVariable Integer currentPage){
		/*
		 * System.out.println("cno:"+wei.get("cno").toString()+"izt:"+Integer.parseInt(
		 * wei.get("izt").toString())
		 * +"jdate:"+wei.get("jdate").toString()+"jdateEnd:"+wei.get("jdateEnd").
		 * toString());
		 */
		return Inbiz.findAllByInststion(wei.get("cno").toString(), Integer.parseInt(wei.get("izt").toString()) ,
				(String)wei.get("jdate"), (String) wei.get("jdateEnd"), size, currentPage);
	}
}
