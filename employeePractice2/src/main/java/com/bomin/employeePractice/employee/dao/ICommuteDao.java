package com.bomin.employeePractice.employee.dao;

public interface ICommuteDao {
	
	int checkIn(String phoneN);

	int checkOut(String phoneN);
	
	int idSelect(String phoneN);
	

}
