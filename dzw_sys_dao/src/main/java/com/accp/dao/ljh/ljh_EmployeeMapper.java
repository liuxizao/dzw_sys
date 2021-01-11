package com.accp.dao.ljh;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Employee;
import com.accp.pojo.Zhiwei;

/**
 * 
 * @author Liu Jia Hui
 *员工表 
 */
public interface ljh_EmployeeMapper {
	
	/**
	 * 查询员工的信息
	 * @return
	 */
	List<Employee> queryEmpAll(@Param("ename")String ename,@Param("status")Integer status,@Param("zid") Integer zid);

	
	/**
	 * 员工离职
	 * @return
	 */
	@Update("update employee set eyunayin=#{eyunayin},ezuant=#{ezuant},elaimes=#{elaimes} where ephone=#{ephone}")
	int updateEmp(@Param("ephone")String ephone,@Param("eyunayin")String eyunayin,@Param("ezuant")Integer ezuant
			,@Param("elaimes")Date date);
}
