package com.accp.action.ljh;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.BootstrapWith;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ljh.InststionBiz;
import com.accp.biz.ljh.wxxqBiz;
import com.accp.biz.yyt.teamBiz;
import com.accp.biz.yyt.workcarBiz;
import com.accp.pojo.Employee;
import com.accp.pojo.Inststion;
import com.accp.pojo.Team;
import com.accp.pojo.Workcar;
import com.accp.pojo.Wxxq;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Liu Jia Hui
 *维修信息表
 */
@RestController
@RequestMapping("/api/Wei")
public class InststionAction {

	@Autowired
	InststionBiz Inbiz;//维修业务	
	@Autowired
	teamBiz Tbiz;//班组
	@Autowired
	private workcarBiz Wbiz;//救援车辆
	
	/**
	 * 查询所有
	 * @return
	 */
	@PostMapping("/all/{size}/{currentPage}")
	public PageInfo<Inststion> findEmpPageInfoAll(@RequestBody Map<String, Object> wei,
			@PathVariable Integer size,@PathVariable Integer currentPage){
//		System.out.println("cno:"+wei.get("cno").toString()+"izt:"+Integer.parseInt(wei.get("izt").toString())
//				+"jdate:"+wei.get("jdate").toString()+"jdateEnd:"+wei.get("jdateEnd").toString());
		
		return Inbiz.findAllByInststion(wei.get("cno").toString(), Integer.parseInt(wei.get("izt").toString()) ,
				(String)wei.get("jdate"), (String) wei.get("jdateEnd"), size, currentPage);
	}
	
	/**
	 * 修改
	 * @param i 
	 * @return
	 */
	@PutMapping("/update")
	public int modifiyInststion(@RequestBody Inststion i) {
		i.setJdate(new Date());
		return Inbiz.updateInststion(i);
	}
	
	/**
	 * 修改
	 * @param i 
	 * @return
	 */
	@PutMapping("/updatejun")
	public int modifiyInststions(@RequestBody Inststion i) {
		i.setWgday(new Date());
		return Inbiz.updateInststion(i);
	}
	
	/**
	 * 查询id
	 * @return
	 */
	@GetMapping("/ID")
	public String selectID() {
		PageInfo<Inststion> pageifo= Inbiz.findAllByInststion("",4,null,null,100, 1);
			int c= pageifo.getList().size()+1;//总长度
			Date date = new Date();
			String dateStr = new SimpleDateFormat("yyyyMMdd").format(date);
			System.out.println(dateStr+"---"+c);
			if(c>=10) {
				return dateStr+"0"+c;
			}else if(c>100) {
				return dateStr+c;
			}else {
				return dateStr+"00"+c;
			}		
	}
	
	/**
	 * 新增
	 * @param i
	 * @return
	 */
	@PostMapping("/insert")
	public int insertInststion(@RequestBody Inststion i) {
		Team t =new Team();
		t.setTzhuant(1);
		t.setTid(i.getTid());
		Tbiz.updateTeam(t);
		Workcar w =new Workcar();
		w.setCzt(1);
		w.setWid(i.getWid());
		Wbiz.updateWorkcar(w);
		return Inbiz.insertInststion(i);
	}
	
}
