package com.bomin.employeePractice.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bomin.employeePractice.shop.ShopVO;
import com.bomin.employeePractice.shop.dao.ShopDao;


@Service
public class ShopService implements IShopService{
	
	@Autowired
	ShopDao dao;
	
	
	public ShopService() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public void shopInsert(ShopVO shop) {
		int result=dao.shopInsert(shop);
		
		if(result==0) {
			System.out.println("실패");
		} else {
			System.out.println("성공");
		}
		
		
	}
	
	@Override
	public List<ShopVO> shopSelectAll() {
		List<ShopVO> shops = dao.shopSelectAll();
		return shops;
	}
	
<<<<<<< HEAD
	@Override
	public ShopVO shopSearch(ShopVO shop) {
		shop = dao.shopSelect(shop);
		
		
		
		return shop;
	}
=======
>>>>>>> branch 'master' of https://github.com/90factory/3rd_employee.git

}
