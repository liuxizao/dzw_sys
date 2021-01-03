package com.accp.action.yyt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.yyt.artisanBiz;
import com.accp.pojo.Artisan;
/**
 * 
 * @author Yang Yu Tao
 *技工表
 */
@RestController
@RequestMapping("/api/Artisans")
public class artisanAction {

	@Autowired
	private artisanBiz biz;
	
	
	/**
	 * 查询所有
	 * @return
	 */
	@GetMapping
	public List<Artisan> selectAll(){
		return biz.selectAll();
	}
	
	/**
	 * 根据班组查询技工
	 * @return
	 */
	@PostMapping("/ByTid")
	public List<Artisan> selectAll(@RequestBody Artisan a){
		System.out.println(a.getSid());
		return biz.selectByTid(a);
	}
}
