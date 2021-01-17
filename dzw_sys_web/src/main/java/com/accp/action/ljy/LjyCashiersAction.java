package com.accp.action.ljy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ljy.LjyCashiersBiz;
import com.accp.pojo.Cashiers;
import com.accp.pojo.Chongzhi;
import com.accp.pojo.Client;
import com.accp.pojo.Clientcar;
import com.accp.pojo.Inststion;
import com.accp.pojo.LjyChongzhi;
import com.accp.pojo.LjyWorkcar;
import com.accp.pojo.Wxxq;

@RestController
@RequestMapping("/api/ljy/empl")  
public class LjyCashiersAction {
	@Resource
	private LjyCashiersBiz ljyCashiersBiz;
	
	@GetMapping("selectByPrimaryKey/{phone}/{kk}")
	public List<Inststion> selectByPrimaryKey(@PathVariable String phone,@PathVariable String kk) {
		return ljyCashiersBiz.selectByPrimaryKey(phone,kk);
	}
	
	@GetMapping("selectByPrimaryKeyByinid/{inid}")
	public List<Wxxq> selectByPrimaryKeyByinid(@PathVariable String inid) {
		return ljyCashiersBiz.selectByPrimaryKeyByinid(inid);
	}
	
	@GetMapping("selectyAllHyljyczByphone/{phone}")
	public  List<Chongzhi>  selectyAllHyljyczByphone(@PathVariable String phone) {
		return ljyCashiersBiz.selectyAllHyljyczByphone(phone);
	}
	
	@GetMapping("selectyAllHyljycztjByphone/{tj}")
	public  Client  selectyAllHyljycztjByphone(@PathVariable String tj) {
		return ljyCashiersBiz.selectyAllHyljycztjByphone(tj);
	}
	
	@GetMapping("selectClient/{cno}")
	public Client selectClient(@PathVariable String cno) {
		return ljyCashiersBiz.selectClient(cno);
	}
	
	@GetMapping("selectClientcar/{cliphone}")
	public Clientcar selectClientcar(@PathVariable String cliphone) {
		return ljyCashiersBiz.selectClientcar(cliphone);
	}
	
	@GetMapping("selectLjyWorkcar/{inid}")
	public LjyWorkcar selectLjyWorkcar(@PathVariable String inid) {
		return ljyCashiersBiz.selectLjyWorkcar(inid);
	}
	
	@PostMapping("updateBycno/{cno}")
	public int updateBycno(@PathVariable String cno){
		return ljyCashiersBiz.updateBycno(cno);
	}
	
	@PostMapping("updateByinid/{inid}")
	public int updateByinid(@PathVariable String inid){
		return ljyCashiersBiz.updateByinid(inid);
	}
	
	@PostMapping("updateByphone/{zhjg}/{cliphone}")
	public int updateByphone(@PathVariable String zhjg,@PathVariable String cliphone){
		return ljyCashiersBiz.updateByphone(zhjg,cliphone);
	}
	
	
	@PostMapping("selectyAllHyljy/{phone}")
	public List<Client> selectyAllHyljy(@PathVariable String phone) {
		System.out.println(phone);  
		return ljyCashiersBiz.selectyAllHyljy(phone);
	}
	
	@PostMapping("selectyAllHyljyByphone/{phone}")
	public Client selectyAllHyljyByphone(@PathVariable String phone) {
		System.out.println(phone);
		return ljyCashiersBiz.selectyAllHyljyByphone(phone);
	}
	
	@PostMapping("updateczByphone/{phone}/{je}")
	public int updateczByphone(@PathVariable String phone,@PathVariable String je){
		return ljyCashiersBiz.updateczByphone(phone,je);
	}
	
	@PostMapping("updateczkkByphone/{phone}/{je}")
	public int updateczkkByphone(@PathVariable String phone,@PathVariable String je){
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
		String dqsj=s.format(d);
		System.out.println("当前时间是："+dqsj);
		return ljyCashiersBiz.updateczkkByphone(phone,je,dqsj);
	}
	
	@PostMapping("addCz/{phone}/{zf}/{je}")
	public int addCz(@PathVariable String phone,@PathVariable String zf,@PathVariable String je){
		System.out.println("结果是："+phone+zf+je+"0"+"2020-02-02");
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
		String dqsj=s.format(d);
		return ljyCashiersBiz.insaddCz(phone,zf,je,"0",dqsj);
	}
	
	@PostMapping("insaddsyjl/{inid}/{price}/{zf}")
	public int insaddsyjl(@PathVariable String inid,@PathVariable String price,@PathVariable String zf){
		System.out.println("贾克斯京东卡黄寺大街卡和数据库的哈"+inid+price+zf);
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("yyyyMMddhhmmss");
		String dqsj=s.format(d);
		return ljyCashiersBiz.insaddsyjl(dqsj,inid,price,zf,dqsj);
	}
	
	@PostMapping("deletezc/{phone}")
	public int deletezc(@PathVariable String phone){
		return ljyCashiersBiz.deletezc(phone);
	}
	
	@PostMapping("updatehy/{phone}")
	public int updatehy(@PathVariable String phone){
		return ljyCashiersBiz.updatehy(phone);
	}
	
	
}
