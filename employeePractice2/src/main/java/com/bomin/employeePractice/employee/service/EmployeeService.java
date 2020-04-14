package com.bomin.employeePractice.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bomin.employeePractice.employee.EmployeeVO;
import com.bomin.employeePractice.employee.dao.EmployeeDao;

@Service
public class EmployeeService implements IEmployeeService{
	
	@Autowired
	EmployeeDao dao;
	
	
	@Override
	public void employeeInsert(EmployeeVO employee) {
	int result=dao.employeeInsert(employee);
	
	if(result==0) {
		System.out.println("실패");
	} else {
		System.out.println("성공");
	}
	
	}
	

	
	@Override
	public void employeeDelete(EmployeeVO employee) {
		dao.employyDelete(employee);
		
		
	}
	
	@Override
	public EmployeeVO employeeSelectByID(int id) {
		EmployeeVO employee=dao.employeeSelectByID(id);
		
		return employee;
	}
	
	@Override
	public List<EmployeeVO> employeeSelectByName(String name) {
		List<EmployeeVO> employees = dao.employeeSelectByName(name);
		return employees;
	
	}
	
	@Override
	public void employeeUpdate(EmployeeVO employee) {
		int result = dao.employeeUpdate(employee);
	
		if(result==0) {
			System.out.println("실패");
		} else {
			System.out.println("성공");
		}
		
	}



	@Override
	public List<EmployeeVO> employeeSelectAll() {
		List<EmployeeVO> employees = dao.employeeSelectAll();
		
		return employees;
	}

}
