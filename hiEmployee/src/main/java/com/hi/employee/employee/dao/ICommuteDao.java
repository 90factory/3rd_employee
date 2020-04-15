package com.hi.employee.employee.dao;

public interface ICommuteDao {
	
	int checkIn(String finger);

	int checkOut(String finger);
	
	int idSelect(String finger);
	

}
