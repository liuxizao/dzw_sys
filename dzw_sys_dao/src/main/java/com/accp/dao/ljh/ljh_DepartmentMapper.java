package com.accp.dao.ljh;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Department;
import com.accp.pojo.Employee;

/**
 * 
 * @author Liu Jia Hui
 *���ű� 
 */
public interface ljh_DepartmentMapper {

	/**
	 * ��ѯ���ŵ���Ϣ
	 * @return
	 */
	@Select("select * from department ")
	List<Department> queryDeAll();

	
}
