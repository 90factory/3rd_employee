package com.bomin.employeePractice.toDo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bomin.employeePractice.employee.EmployeeVO;
import com.bomin.employeePractice.toDo.ToDoVO;
import com.bomin.employeePractice.toDo.dao.ToDoDao;

@Service
public class ToDoService implements IToDoService{

	@Autowired
	ToDoDao dao;
	
	@Override
	public void toDoInsert(ToDoVO toDo, EmployeeVO employee) {
	
		int result = dao.toDoInsert(toDo, employee);
		if(result==0) {
			System.out.println("실패");
		} else {
			System.out.println("성공");
		}
	}
	
	@Override
	public List<ToDoVO> toDoSelect(EmployeeVO employee) {
		List<ToDoVO> toDos = dao.toDoSelect(employee);
		return toDos;
	}
	
	@Override
	public void toDoUpdate() {
		//int result = dao.toDoUpdate();
		
	}
	
	
	
}
