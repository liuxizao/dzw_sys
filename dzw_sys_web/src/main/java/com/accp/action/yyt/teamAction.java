package com.accp.action.yyt;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.yyt.teamBiz;
import com.accp.pojo.Team;

@RestController
@RequestMapping("/api/Teams")
public class teamAction {
	
	@Autowired
	private teamBiz biz;
	
	/**
	 * 查询所有   连表查询技工
	 * @return
	 */
	@GetMapping("/Artisan")
	public List<Team> selectTeamAll(){
		return biz.selectTeamAll();
	}
	
	/**
	 * 查询所有
	 * @return
	 */
	@GetMapping
	public List<Team> selectTeam(){
		return biz.selectTeam();
	}

}
