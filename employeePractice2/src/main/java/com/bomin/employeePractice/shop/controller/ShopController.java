package com.bomin.employeePractice.shop.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bomin.employeePractice.shop.ShopVO;
import com.bomin.employeePractice.shop.service.ShopService;

@RestController
public class ShopController {

	@Autowired
	ShopService shopService;
	
	private static final Logger logger = LoggerFactory.getLogger(ShopController.class);
	
	
	@RequestMapping(value = "/shop", method=RequestMethod.POST, headers={"Content-type=application/json"})
	public Map shopInsert(@RequestBody ShopVO shop) {
		if(shop!=null)
		shopService.shopInsert(shop);
		
		Map result=new HashMap();
		result.put("result", Boolean.TRUE);
		return result;
	}
	
	
	@RequestMapping(value="/shop", method=RequestMethod.GET)
	public Map shopSelectAll(){
		List<ShopVO> shopList=shopService.shopSelectAll();
		Map result=new HashMap();
		result.put("result", Boolean.TRUE);
		result.put("data", shopList);
		return result;
	}
	
	
}
