package com.accp.action.ljh;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ljh.EmployeeBiz;
import com.accp.pojo.Department;
import com.accp.pojo.Employee;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Liu Jia Hui
 *员工职位表
 */
@RestController
@RequestMapping("/api/Emp")
public class EmployeeAction {
	
	@Autowired
	private EmployeeBiz service;
	
	/**
	 * 查询所有
	 * @return
	 */
	@PostMapping("/all/{size}/{currentPage}")
	public PageInfo<Employee> findEmpPageInfoAll(@RequestBody Employee emp,
			@PathVariable Integer size,
			@PathVariable Integer currentPage){
		System.out.println(1);
		return service.findEmpPageInfoAll(emp.getEname(), emp.getEzuant(), emp.getDeid(), size, currentPage);
	}
	
	@PostMapping("/bu")
	public List<Department> findBu(){
		return service.findAllDe();
	}
	
	/**
	 * 修改
	 * @param stars
	 * @return
	 */
	@PutMapping("/update")
	public int updatStars(@RequestBody Employee zhiwei) {
		return service.updateEmp(zhiwei);
	}
	
	/**
	 * 离职复职
	 * @param stars
	 * @return
	 */
	@PutMapping("/updateli")
	public int updatEmp(@RequestBody Employee emp) {
		emp.setElaimes(new Date());
		return service.updateEmpLi(emp);
	}
	
	/**
	 * 删除
	 * @param sid
	 * @return
	 */
	@DeleteMapping("/delete/{ephone}")
	public int deleteStars(@PathVariable String ephone) {
		//System.out.println(s.getSid());
		return service.deleteEmp(ephone);
	}
	
	/**
	 * 新增
	 * @param stars
	 * @return
	 */
	@PostMapping("/insert")
	public int insertStars(@RequestBody Employee zhiwei) {
		return service.insertEmp(zhiwei);
	}
	
}
