package com.hi.employee.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.employee.employee.dao.CommuteDao;

@Service
public class CommuteService implements ICommuteService{
	
	@Autowired
	CommuteDao dao;
	
	@Override
	public void checkIn(String finger) {
		System.out.println("service" + finger);
		dao.checkIn(finger);	
	}
	
	@Override
	public void checkOut(String finger) {
		dao.checkOut(finger);
	}
	

}
