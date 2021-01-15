package com.accp.action.ljh;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ljh.FangGongBiz;
import com.accp.pojo.Fangong;
import com.accp.pojo.Inststion;
import com.github.pagehelper.PageInfo;


/**
 * 
 * @author 321
 *返工信息表
 */
@RestController
@RequestMapping("/api/Fan")
public class FanggongAction {
	
	@Autowired
	FangGongBiz fbiz;//返工业务
	
	/**
	 * 查询所有
	 * @return
	 */
	@PostMapping("/all/{inid}")
	public int findCount(@PathVariable String inid){
		return fbiz.findAll(inid);
	}
	
	/**
	 * 新增返工
	 * @return
	 */
	@PostMapping("/fan")
	public int findCount(@RequestBody Map<String,String> map){
		Fangong f=new Fangong();
		f.setInid(map.get("inid"));
		f.setFyuany(map.get("fyuany"));
		return fbiz.insertFangGong(f);
	}
}
