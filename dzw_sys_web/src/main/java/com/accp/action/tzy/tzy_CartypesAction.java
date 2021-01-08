package com.accp.action.tzy;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.tzy.tzy_CartypesBiz;
import com.accp.pojo.Cartypes;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/tzy/cartypes")
public class tzy_CartypesAction {
	@Resource
	public tzy_CartypesBiz cb;
	
	/**
	 * 查询全部车辆品牌
	 * @return
	 */
	@GetMapping("querycar")
	public List<Cartypes> querycar(){
		return cb.querycar();
	}
	/**
	 * 分页查询全部车辆品牌
	 * @return
	 */
	@GetMapping("querycartypes/{carname}/{p}/{s}")
	public PageInfo<Cartypes> querycartypes(@PathVariable String carname,@PathVariable Integer p,@PathVariable Integer s){
		return cb.querycartypes(carname,p,s);
	}
	
	/**
	 * 添加车辆品牌
	 * @param car
	 * @return
	 */
	@PostMapping("addcar")
	public int inscar(@RequestBody Cartypes car) {
		return cb.inscar(car);
	}
	
	/**
	 * 删除车辆品牌
	 * @param ctid
	 * @return
	 */
	@GetMapping("delcar/{ctid}")
	public int delcar(@PathVariable Integer ctid) {
		return cb.delcar(ctid);
	}
	
	/**
	 * 修改车辆品牌
	 * @param car
	 * @return
	 */
	@PostMapping("updcar")
	public int updcar(@RequestBody Cartypes car) {
		return cb.updcar(car);
	}
}
