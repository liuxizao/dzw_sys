package com.accp.biz.yyt;

/**
 * 
 * @author Yang Yu Tao
 *技工班组表
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.TeamMapper;
import com.accp.dao.yyt.yyt_teamMapper;
import com.accp.pojo.Team;

@Service
public class teamBiz {

	@Autowired
	private yyt_teamMapper yytMapper;// yyt
	@Autowired
	private TeamMapper mapper;// 公共Mapper

	/**
	 * 根据状态查询当前班组
	 * 
	 * @return
	 */
	public List<Team> selectByZt() {
		return yytMapper.selectByZt();
	}

	/**
	 * 查询所有 连表查询技工表
	 * 
	 * @return
	 */
	public List<Team> selectTeamAll() {
		return yytMapper.selectTeamAll();
	}

	/**
	 * 新增
	 * 
	 * @param t
	 * @return
	 */
	public int insertTeam(Team t) {
		return mapper.insertSelective(t);
	}

	/**
	 * 修改
	 * 
	 * @param t
	 * @return
	 */
	public int updateTeam(Team t) {
		return mapper.updateByPrimaryKeySelective(t);
	}

	/**
	 * 删除
	 * 
	 * @param tid
	 * @return
	 */
	public int deleteTeam(Integer tid) {
		return mapper.deleteByPrimaryKey(tid);
	}

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public List<Team> selectTeam() {
		return yytMapper.selectTeam();
	}

	/**
	 * 根据名称查询
	 * 
	 * @param name
	 * @return
	 */
	public Team selectByName(String name) {
		return yytMapper.selectByName(name);
	}

}
