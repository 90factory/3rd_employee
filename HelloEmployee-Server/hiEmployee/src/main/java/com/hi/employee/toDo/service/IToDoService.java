package com.hi.employee.toDo.service;

import java.util.List;

import com.hi.employee.employee.EmployeeVO;
import com.hi.employee.toDo.ToDoVO;

public interface IToDoService {
	
	void toDoInsert(ToDoVO toDo, EmployeeVO employee);
	
	List<ToDoVO> toDoSelect(EmployeeVO employee);
	
	void toDoUpdate();
	
	List<ToDoVO> toDoSelectbyName(String name);
	
}
