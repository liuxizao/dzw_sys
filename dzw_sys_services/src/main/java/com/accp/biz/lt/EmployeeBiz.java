package com.accp.biz.lt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.EmployeeMapper;
import com.accp.pojo.Employee;

@Service
public class EmployeeBiz {

	@Autowired
	private EmployeeMapper empl;
	
	//查询
	public Employee selOne() {
		return empl.selectByPrimaryKey("12345678900");
	}
}
