package com.accp.action.lt;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lt.EmployeeBiz;
import com.accp.pojo.Employee;

@RestController
@RequestMapping("/api/lt/empl")
public class EmployeeAction {

	@Resource
	private EmployeeBiz emp;
	
	@GetMapping
	public Employee selOne() {
		return emp.selOne();
	}
}
