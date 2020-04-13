package com.bomin.employeePractice.shop.dao;

import java.util.List;

import com.bomin.employeePractice.employee.EmployeeVO;
import com.bomin.employeePractice.shop.ShopVO;

public interface IShopDao {
	int shopInsert(ShopVO shop);
	ShopVO shopSelectByID(String ID);
	List<ShopVO> shopSelectAll();

	int shopUpdate(ShopVO shop);
	
	int shopLogIn(String ID, String name);
	
	int shopLogOut();
}


/*  /shop/login -> /employee -> / */