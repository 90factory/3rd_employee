package com.bomin.employeePractice.employee.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bomin.employeePractice.employee.EmployeeVO;
import com.bomin.employeePractice.employee.service.CommuteService;

/**
 * Handles requests for the application home page.
 */
@RestController
public class CommuteController {
	
	@Autowired
	CommuteService commuteService;
	
	private static final Logger logger = LoggerFactory.getLogger(CommuteController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/commute", method = RequestMethod.POST, headers= {"Content-type=application/json"} )
	public Map checkIn(@RequestBody EmployeeVO employee) {
			commuteService.checkIn(employee.getEmPhone());
			
			Map result=new HashMap();
			result.put("result", Boolean.TRUE);
			return result;
	}
	
	
	
	@RequestMapping(value = "/commute", method = RequestMethod.PUT,headers= {"Content-type=application/json"})
	public Map checkOut(@RequestBody EmployeeVO employee) {
		
			commuteService.checkOut(employee.getEmPhone());
			Map result=new HashMap();
			result.put("result", Boolean.TRUE);
			return result;
	}
	
	
}
