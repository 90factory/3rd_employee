package com.hi.employee.shop.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hi.employee.shop.ShopVO;
import com.hi.employee.shop.service.ShopService;

@RestController
public class SessionController {
	
	@Autowired
	ShopService shopService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String shopLogin(ShopVO shop, HttpSession session) {
		
		ShopVO shopVO = shopService.shopSearch(shop);
		
		session.setAttribute("shop", shopVO);
		return "/WEB-INF/views/index.jsp";
		
	}

}
