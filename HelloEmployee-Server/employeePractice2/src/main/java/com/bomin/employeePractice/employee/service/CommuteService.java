package com.bomin.employeePractice.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bomin.employeePractice.employee.dao.CommuteDao;

@Service
public class CommuteService implements ICommuteService{
	
	@Autowired
	CommuteDao dao;
	
	@Override
<<<<<<< HEAD
	public void checkIn(String finger) {
		System.out.println("service" + finger);
		dao.checkIn(finger);	
	}
	
	@Override
	public void checkOut(String finger) {
		dao.checkOut(finger);
=======
	public void checkIn(String phone) {
		dao.checkIn(phone);	
	}
	
	@Override
	public void checkOut(String phone) {
		dao.checkOut(phone);
>>>>>>> branch 'master' of https://github.com/90factory/3rd_employee.git
	}
	

}
