package com.bomin.employeePractice.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bomin.employeePractice.employee.dao.CommuteDao;

@Service
public class CommuteService implements ICommuteService{
	
	@Autowired
	CommuteDao dao;
	
	@Override
	public void checkIn(String phone) {
		dao.checkIn(phone);	
	}
	
	@Override
	public void checkOut(String phone) {
		dao.checkOut(phone);
	}
	

}
