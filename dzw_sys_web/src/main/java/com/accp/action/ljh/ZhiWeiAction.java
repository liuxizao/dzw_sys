package com.accp.action.ljh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ljh.ZhiWeiBiz;
import com.accp.biz.yyt.starsBiz;
import com.accp.pojo.Stars;
import com.accp.pojo.Zhiwei;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Liu Jia Hui
 *员工职位表
 */
@RestController
@RequestMapping("/api/Zhiwei")
public class ZhiWeiAction {

	@Autowired
	private ZhiWeiBiz service;
	
	/**
	 * 查询所有
	 * @return
	 */
	@PostMapping("/all/{size}/{currentPage}")
	public PageInfo<Zhiwei> selectStarsAll(@RequestBody Zhiwei zhiwei,
			@PathVariable Integer size,
			@PathVariable Integer currentPage){
		System.out.println(zhiwei.getZname());
		return service.selectStarsAll(zhiwei.getZname(),size,currentPage);
	}
	
	/**
	 * 修改
	 * @param stars
	 * @return
	 */
	@PutMapping("/update")
	public int updatStars(@RequestBody Zhiwei zhiwei) {
		return service.updateStars(zhiwei);
	}
	
	/**
	 * 删除
	 * @param sid
	 * @return
	 */
	@DeleteMapping("/delete/{zid}")
	public int deleteStars(@PathVariable Integer zid) {
		//System.out.println(s.getSid());
		return service.deleteStars(zid);
	}
	
	/**
	 * 新增
	 * @param stars
	 * @return
	 */
	@PostMapping("/insert")
	public int insertStars(@RequestBody Zhiwei zhiwei) {
		return service.insertStars(zhiwei);
	}
	
	/**
	 * 根据名称查询
	 * @param starts
	 * @return
	 */
	@GetMapping("/byName/{zname}")
	public Zhiwei selectByName(@PathVariable String zname) {
		//System.out.println(starts);
		return service.selectByName(zname);
	}
	
}
