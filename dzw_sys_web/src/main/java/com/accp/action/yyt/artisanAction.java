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

import com.accp.biz.yyt.artisanBiz;
import com.accp.pojo.Artisan;
import com.github.pagehelper.PageInfo;
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
	@PostMapping("/ByTid/{size}/{currentPage}")
	public PageInfo<Artisan> selectAll(@RequestBody Artisan a,
			@PathVariable Integer size,@PathVariable Integer currentPage){
		//System.out.println(a.getSid());
		return biz.selectByTid(a,currentPage,size);
	}
	
	/**
	 * 新增
	 * @param a
	 * @return
	 */
	@PostMapping("/insert")
	public int insertArtisan(@RequestBody Artisan a) {
		return biz.insertArtisan(a);
	}
	
	/**
	 * 修改
	 * @param a
	 * @return
	 */
	@PutMapping("/update")
	public int updateArtisan(@RequestBody Artisan a) {
		return biz.updateArtisan(a);
	}
	
	/**
	 * 删除
	 * @param aphone
	 * @return
	 */
	@DeleteMapping("/delete/{aphone}")
	public int deleteArtisan(@PathVariable String aphone) {
		return biz.deleteArtisan(aphone);
	}
	
	/**
	 * 查询当前班组是否有组长
	 * @param tid
	 * @return
	 */
	@GetMapping("/ByZid/{tid}")
	public String selectByZid(@PathVariable Integer tid) {
		return biz.selectByZid(tid);
	}
	
	/**
	 * 根据手机号码查询
	 * @param aphone
	 * @return
	 */
	@GetMapping("/ByPhone/{aphone}")
	public Artisan selectByPhone(@PathVariable String aphone) {
		return biz.selectByPhone(aphone);
	}
}
