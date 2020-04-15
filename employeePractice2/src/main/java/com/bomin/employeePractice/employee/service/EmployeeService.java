package com.bomin.employeePractice.employee.service;

<<<<<<< HEAD
import java.io.IOException;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bomin.employeePractice.employee.EmployeeVO;
import com.bomin.employeePractice.employee.dao.EmployeeDao;

@Service
public class EmployeeService implements IEmployeeService{
	
	@Autowired
	EmployeeDao dao;
	
	
	public EmployeeService() {
		// TODO Auto-generated constructor stub
	}
	
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

	
	@Override
	public void fingerInsert(EmployeeVO employee) throws JSONException, IOException {
		int result = dao.fingerPrintInsert(employee);
		
		if(result==0) {
			System.out.println("실패");
		} else {
			System.out.println("성공");
		}
	}
	
	@Override
	public EmployeeVO readFinger(EmployeeVO employee) throws JSONException, IOException {
		employee=dao.fingerSearch(employee);
		return employee;
		
	}
	
	
	
	
	
=======
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

>>>>>>> branch 'master' of https://github.com/90factory/3rd_employee.git
}
