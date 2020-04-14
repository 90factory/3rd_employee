package com.bomin.employeePractice.employee.service;

import java.util.List;

import com.bomin.employeePractice.employee.EmployeeVO;

public interface IEmployeeService {
	
	void employeeInsert(EmployeeVO employee);
	EmployeeVO employeeSelectByID(int id);
	List<EmployeeVO> employeeSelectByName(String name);
	List<EmployeeVO> employeeSelectAll();
	void employeeUpdate(EmployeeVO employee);
	void employeeDelete(EmployeeVO employee);

}
