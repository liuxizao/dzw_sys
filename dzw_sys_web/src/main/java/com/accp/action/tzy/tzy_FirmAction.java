package com.accp.action.tzy;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.tzy.tzy_FirmBiz;
import com.accp.pojo.Firm;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/tzy/firm")
public class tzy_FirmAction {
	@Resource
	public tzy_FirmBiz fb;
	/**
	 * 查询发动机供应商
	 * @return
	 */
	@GetMapping("queryfirm/{firmname}/{p}/{s}")
	public PageInfo<Firm> queryfirm(@PathVariable String firmname,@PathVariable Integer p,@PathVariable Integer s){
		
		return fb.queryfirm(firmname,p,s);
	}
	
	/**
	 * 删除商品供应商
	 * @param firmid
	 * @return
	 */
	@GetMapping("deletefirm/{firmid}")
	public int delfirm(@PathVariable Integer firmid) {
		return fb.delfirm(firmid);
	}
	
	/**
	 * 添加供应商信息
	 * @param record
	 * @return
	 */
	@PostMapping("addfirm")
	public int insfirm(@RequestBody Firm record) {
		return fb.insfirm(record);
	}
	
	/**
	 * 修改供应商
	 * @param record
	 * @return
	 */
	@PostMapping("updfirm")
	public int updfirm(@RequestBody Firm record) {
		return fb.updfirm(record);
	}
}
