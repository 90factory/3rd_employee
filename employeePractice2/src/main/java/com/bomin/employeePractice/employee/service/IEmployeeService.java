package com.bomin.employeePractice.employee.service;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;

import com.bomin.employeePractice.employee.EmployeeVO;

public interface IEmployeeService {
	
	void employeeInsert(EmployeeVO employee);
	EmployeeVO employeeSelectByID(int id);
	List<EmployeeVO> employeeSelectByName(String name);
	List<EmployeeVO> employeeSelectAll();
	void employeeUpdate(EmployeeVO employee);
	void employeeDelete(EmployeeVO employee);

	EmployeeVO readFinger(EmployeeVO employee) throws JSONException, IOException;
	void fingerInsert(EmployeeVO employee) throws JSONException, IOException;
}
