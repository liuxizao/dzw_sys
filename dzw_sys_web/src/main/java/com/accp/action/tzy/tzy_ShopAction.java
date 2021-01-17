package com.accp.action.tzy;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.tzy.tzy_ShopBiz;
import com.accp.pojo.Shop;
import com.accp.pojo.Wxxq;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/tzy/shop")
public class tzy_ShopAction {
	@Resource
	private tzy_ShopBiz sb;
	
	/**
	 * 查询维修项目
	 * @return
	 */
	@GetMapping("queryAA/{p}/{s}")
	public PageInfo<Shop> queryAA(@PathVariable Integer s,@PathVariable Integer p){
		return sb.queryAA(p, s);
	}
	
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
	 * 修改
	 * @param s
	 * @return
	 */
	@PostMapping("/update")
	public int updateShopfdj(@RequestBody String s) {
		int i=0;
		JSONArray array=JSONArray.parseArray(s);
		for (int j = 0; j < array.size(); j++) {
			JSONObject object=array.getJSONObject(j);
			//System.out.println(object);
			Shop sh=(Shop)JSON.toJavaObject(object, Shop.class);
			i+=sb.updshopfdj(sh);
		}
		return i;
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
