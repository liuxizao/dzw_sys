package com.accp.action.yyt;

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

import com.accp.biz.yyt.starsBiz;
import com.accp.pojo.Stars;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Yang Yu Tao
 *技工星级表
 */
@RestController
@RequestMapping("/api/Starss")
public class starsAction {

	@Autowired
	private starsBiz service;
	
	/**
	 * 根据id查询
	 * @param sid
	 * @return
	 */
	@GetMapping("/ByID/{sid}")
	public Stars sletectById(@PathVariable Integer sid) {
		return service.sletectById(sid);
	}
	
	/**
	 * 查询所有
	 * @return
	 */
	@PostMapping("/all/{size}/{currentPage}")
	public PageInfo<Stars> selectStarsAll(@RequestBody Stars s,
			@PathVariable Integer size,
			@PathVariable Integer currentPage){
		System.out.println(s.getStarts());
		return service.selectStarsAll(s.getStarts(),size,currentPage);
	}
	
	/**
	 * 修改
	 * @param stars
	 * @return
	 */
	@PutMapping("/update")
	public int updatStars(@RequestBody Stars stars) {
		return service.updateStars(stars);
	}
	
	/**
	 * 删除
	 * @param sid
	 * @return
	 */
	@DeleteMapping("/delete/{sid}")
	public int deleteStars(@PathVariable Integer sid) {
		//System.out.println(s.getSid());
		return service.deleteStars(sid);
	}
	
	/**
	 * 新增
	 * @param stars
	 * @return
	 */
	@PostMapping("/insert")
	public int insertStars(@RequestBody Stars stars) {
		return service.insertStars(stars);
	}
	
	/**
	 * 根据名称查询
	 * @param starts
	 * @return
	 */
	@GetMapping("/byName/{starts}")
	public Stars selectByName(@PathVariable String starts) {
		//System.out.println(starts);
		return service.selectByName(starts);
	}
}
