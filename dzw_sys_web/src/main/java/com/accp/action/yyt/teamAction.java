package com.accp.action.yyt;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	/**
	 * 删除
	 * @param tid
	 * @return
	 */
	@DeleteMapping("/delete/{tid}")
	public int deleteTeam(@PathVariable Integer tid) {
		return biz.deleteTeam(tid);
	}
	
	/**
	 * 修改
	 * @param t
	 * @return
	 */
	@PutMapping("/update")
	public int updateTeam(@RequestBody Team t) {
		return biz.updateTeam(t);
	}
	
	/**
	 * 新增
	 * @param t
	 * @return
	 */
	@PostMapping("/insert")
	public int insertTeam(@RequestBody Team t) {
		return biz.insertTeam(t);
	}
	
	/**
	 * 根据名称查询
	 * @param name
	 * @return
	 */
	@GetMapping("/ByName/{name}")
	public Team selectByName(@PathVariable String name) {
		return biz.selectByName(name);
	}

}
