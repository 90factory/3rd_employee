package com.bomin.employeePractice.shop.service;

import java.util.List;

import com.bomin.employeePractice.shop.ShopVO;

public interface IShopService {
	void shopInsert(ShopVO shop);
	List<ShopVO> shopSelectAll();
	
	ShopVO shopSearch(ShopVO shop);
}
