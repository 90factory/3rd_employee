package com.hi.employee.employee.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hi.employee.URLReader;
import com.hi.employee.employee.EmployeeVO;
import com.hi.employee.employee.service.CommuteService;

import io.swagger.annotations.Api;

/**
 * Handles requests for the application home page.
 */
@RestController
@Api(value="APIs")
public class CommuteController {
	
	@Autowired
	CommuteService commuteService;
	
	private static final Logger logger = LoggerFactory.getLogger(CommuteController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws IOException 
	 * @throws JSONException 
	 */
	@RequestMapping(value = "/commute", method = RequestMethod.POST, headers= {"Content-type=application/json"} )
	public Map checkIn(@RequestBody EmployeeVO employee) throws JSONException, IOException {
		
		System.out.println("commute 시작");
		URLReader url = new URLReader();
		JSONObject json = url.getFinger();
		
		if(employee!=null) 
			employee.setEmFingerPrint(json.getString("hash"));
		
			commuteService.checkIn(employee.getEmFingerPrint());
			
			Map result=new HashMap();
			result.put("result", Boolean.TRUE);
			return result;
	}
	
	
	
	@RequestMapping(value = "/commute", method = RequestMethod.PUT,headers= {"Content-type=application/json"})
	public Map checkOut(@RequestBody EmployeeVO employee) throws JSONException, IOException {
		URLReader url = new URLReader();
		JSONObject json = url.getFinger();
		if(employee!=null) 
			employee.setEmFingerPrint(json.getString("hash"));
		
			commuteService.checkOut(employee.getEmFingerPrint());
			Map result=new HashMap();
			result.put("result", Boolean.TRUE);
			return result;
	}
	
	
}
