package com.bomin.employeePractice.employee.dao;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;

import com.bomin.employeePractice.employee.EmployeeVO;

public interface IEmployeeDao {
	int employeeInsert(EmployeeVO employee);
	EmployeeVO employeeSelectByID(int ID);
	List<EmployeeVO> employeeSelectByName(String name);
	List<EmployeeVO> employeeSelectAll();

	int employeeUpdate(EmployeeVO employee);
	int employyDelete(EmployeeVO employee);
	
	int fingerPrintInsert(EmployeeVO employee) throws JSONException, IOException;
	
	
	EmployeeVO fingerSearch(EmployeeVO employee) throws JSONException, IOException;
	
}