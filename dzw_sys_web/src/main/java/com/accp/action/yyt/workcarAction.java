package com.accp.action.yyt;
/**
 * 
 * @author Yang Yu Tao
 *外勤车辆
 */

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

import com.accp.biz.yyt.workcarBiz;
import com.accp.pojo.Workcar;
import com.github.pagehelper.PageInfo;
@RestController
@RequestMapping("/api/Workcars")
public class workcarAction {

	@Autowired
	private workcarBiz biz;
	
	/**
	 * 查询
	 * @return
	 */
	@PostMapping("/All/{size}/{currentPage}")
	public PageInfo<Workcar> selectWorkcarAll(@RequestBody Workcar w,
			@PathVariable Integer size,@PathVariable Integer currentPage){
		return biz.selectWorkcarAll(w,size,currentPage);
	}
	
	/**
	 * 新增
	 * @param w
	 * @return
	 */
	@PostMapping("/insert")
	public int insertWorkcar(@RequestBody Workcar w) {
		return biz.insertWorkcar(w);
	}
	
	/**
	 * 修改
	 * @param w
	 * @return
	 */
	@PutMapping("/update")
	public int updateWorkcar(@RequestBody Workcar w) {
		return biz.updateWorkcar(w);
	}
	
	/**
	 * 删除
	 * @param wid
	 * @return
	 */
	@DeleteMapping("/delete/{wid}")
	public int deleteWorkcar(@PathVariable Integer wid) {
		return biz.deleteWorkcar(wid);
	}
	
	/**
	 * 根据车牌号查询
	 * @param caid
	 * @return
	 */
	@GetMapping("/ByCaid/{caid}")
	public int selectByCaid(@PathVariable String caid) {
		return biz.selectByCaid(caid);
	}
}
