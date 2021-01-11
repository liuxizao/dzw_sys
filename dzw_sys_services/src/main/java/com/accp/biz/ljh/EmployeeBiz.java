package com.accp.biz.ljh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.EmployeeMapper;
import com.accp.dao.ljh.ljh_DepartmentMapper;
import com.accp.dao.ljh.ljh_EmployeeMapper;
import com.accp.pojo.Department;
import com.accp.pojo.Employee;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Liu Jia Hui
 *员工信息表
 */
@Service
public class EmployeeBiz {

	@Autowired
	private ljh_DepartmentMapper deMapper;//部门mapper
	
	@Autowired
	private ljh_EmployeeMapper ljhMapper;//ljhmapper
	@Autowired
	private EmployeeMapper mapper;//公共mapper
	
	/**
	 * 查询所有
	 * @return
	 */
	public PageInfo<Employee> findEmpPageInfoAll(String ename,Integer status,Integer zid,Integer size,
			Integer currentPage){
		PageHelper.startPage(currentPage, size);
		return new PageInfo<Employee>(ljhMapper.queryEmpAll(ename, status, zid));
	}
	
	/**
	 * 新增
	 * @param stars 
	 * @return
	 */
	public int insertEmp(Employee zhiwei) {
		return mapper.insert(zhiwei);
	}
	
	/**
	 * 修改
	 * @param stars
	 * @return
	 */
	public int updateEmp(Employee zhiwei) {
		return mapper.updateByPrimaryKeySelective(zhiwei);
	}
	
	
	/**
	 * 删除
	 * @param sid
	 * @return
	 */
	public int deleteEmp(String ephone) {
		return mapper.deleteByPrimaryKey(ephone);
	}
	
	/**
	 * 查询部门
	 * @return
	 */
	public List<Department> findAllDe(){
		return deMapper.queryDeAll();
	}
	
	public int updateEmpLi(Employee emp) {
		return ljhMapper.updateEmp(emp.getEphone(), emp.getEyunayin(), emp.getEzuant(),emp.getElaimes());
	}
	
}
