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
<<<<<<< HEAD
	
	ShopVO shopSelect(ShopVO shop);
=======
>>>>>>> branch 'master' of https://github.com/90factory/3rd_employee.git
}


/*  /shop/login -> /employee -> / */