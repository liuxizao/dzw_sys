package com.accp.action.tzy;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.tzy.tzy_ShopBiz;
import com.accp.pojo.Shop;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/tzy/shop")
public class tzy_ShopAction {
	@Resource
	private tzy_ShopBiz sb;
	
	/**
	 * 查询全部发动机
	 * @return
	 */
	@GetMapping("queryshop/{shopname}/{p}/{s}")
	public PageInfo<Shop> queryshopfdj(@PathVariable String shopname,@PathVariable Integer p,@PathVariable Integer s){
		return sb.queryshopfdj(shopname,p,s);
	}
	/**
	 * 新增发动机
	 * @param gys
	 * @param fdj
	 * @param fdjjg
	 * @param cx
	 * @param sl
	 * @param pp
	 * @return
	 */
	@PostMapping("addshop")
	public int addshopfdj(@RequestBody Shop sp){
		return sb.insshopfdj(sp);
	}
	/**
	 * 删除发动机
	 * @param shopid
	 * @return
	 */
	@GetMapping("deleteshop/{shopid}")
	public int deleteshopfdj(@PathVariable Integer shopid){
		return sb.delshopfdj(shopid);
	}

	/**
	 * 修改发动机
	 * @param record
	 * @return
	 */
	@PostMapping("modifyshop")
	public int modifyshopfdj(@RequestBody Shop record){
		return sb.updshopfdj(record);
	}
	
	/**
	 * 查询全部保养项目
	 * @return
	 */
	@GetMapping("queryshopby/{byname}/{p}/{s}")
	public PageInfo<Shop> queryshopby(@PathVariable String byname,@PathVariable Integer p,@PathVariable Integer s){
		return sb.queryshopby(byname,p,s);
	}
	
	/**
	 * 查询全部维修项目
	 * @return
	 */
	@GetMapping("queryshopwx/{wxname}/{p}/{s}")
	public PageInfo<Shop> queryshopwx(@PathVariable String wxname,@PathVariable Integer p,@PathVariable Integer s){
		return sb.queryshopwx(wxname,p,s);
	}
	
}
