package com.accp.action.lt;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lt.ClientcarBiz;
import com.accp.pojo.Clientcar;

@RestController
@RequestMapping("/api/lt/clicar")
public class ClientcarAction {

	@Resource
	private ClientcarBiz clicar;

	// 按手机号查询车辆
	@PostMapping("{phone}")
	public List<Clientcar> selClientcarMapper(@PathVariable String phone) {
		return this.clicar.selClientcarPhone(phone);
	}

	// 按车牌号查询车辆
	@GetMapping("cnocar/{cno}")
	public List<Clientcar> selCnoMapper(@PathVariable String cno) {
		return this.clicar.selClientcarPhone(cno);
	}

	// 新增车辆
	@PostMapping("inscar")
	public int insclicar(@RequestBody Clientcar cli) {
		cli.setPurdate(new Date());
		return this.clicar.insclicar(cli);
	}

	// 删除车辆信息
	@PostMapping("delkehucar/{cno}")
	public int deleteByPrimaryKey(@PathVariable String cno) {
		return this.clicar.deleteByPrimaryKey(cno);
	}
}
