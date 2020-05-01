package com.bomin.employeePractice.toDo.dao;

import java.util.List;

import com.bomin.employeePractice.employee.EmployeeVO;
import com.bomin.employeePractice.toDo.ToDoVO;

public interface IToDoDao {
	
	int toDoInsert(ToDoVO toDo, EmployeeVO employee);
	
	int toDoUpdate(ToDoVO toDo);
	
	List<ToDoVO> toDoSelect(EmployeeVO employee);
	
	List<ToDoVO> toDoSelectAll();
	
	

}
