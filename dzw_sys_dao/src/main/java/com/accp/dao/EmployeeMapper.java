package com.accp.dao;

import com.accp.pojo.Employee;

public interface EmployeeMapper {
    int deleteByPrimaryKey(String ephone);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(String ephone);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}