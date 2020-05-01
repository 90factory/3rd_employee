package com.bomin.employeePractice.toDo.service;

import java.util.List;

import com.bomin.employeePractice.employee.EmployeeVO;
import com.bomin.employeePractice.toDo.ToDoVO;

public interface IToDoService {
	
	void toDoInsert(ToDoVO toDo, EmployeeVO employee);
	
	List<ToDoVO> toDoSelect(EmployeeVO employee);
	
	void toDoUpdate();
	
}
