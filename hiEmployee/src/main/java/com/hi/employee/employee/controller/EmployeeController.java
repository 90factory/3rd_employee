package com.hi.employee.employee.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hi.employee.URLReader;
import com.hi.employee.employee.EmployeeVO;
import com.hi.employee.employee.service.EmployeeService;

import io.swagger.annotations.Api;

/**
 * Handles requests for the application home page.
 */
@RestController
@Api(value="APIs")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	
	@RequestMapping(value = "/employee/{name}", method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
	public Map employeeSelectByName(@PathVariable String name) {
		
		List<EmployeeVO> employeeList=employeeService.employeeSelectByName(name);
		Map result=new HashMap();
		result.put("result", Boolean.TRUE);
		result.put("data", employeeList);
		
		return result;
			}
	
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST, headers= {"Content-type=application/json"})
	public Map employeeInsert(@RequestBody EmployeeVO employee){
		if(employee!=null)
		employeeService.employeeInsert(employee);
		
		Map result=new HashMap();
		result.put("result", Boolean.TRUE);
		return result;
	}
	
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Map employeeSelectAll() {
		List<EmployeeVO> employeeList=employeeService.employeeSelectAll();
		Map result=new HashMap();
		result.put("result", Boolean.TRUE);
		result.put("data", employeeList);
		return result;
		}
	
	@RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
	public Map employeeSelectByID(@PathVariable int id) {
		EmployeeVO employee= employeeService.employeeSelectByID(id);
		Map result=new HashMap();
		result.put("result", Boolean.TRUE);
		result.put("data", employee);
		return result;
		}
	
	@RequestMapping(value = "/employee", method = RequestMethod.PUT, headers= {"Content-type=application/json"})
	public Map employeeUpdate(@RequestBody EmployeeVO employee){
		if(employee!=null)
		employeeService.employeeUpdate(employee);
		Map result=new HashMap();
		result.put("result", Boolean.TRUE);
		return result;
	}
	
	@RequestMapping(value = "/employee/finger", method = RequestMethod.PUT, headers= {"Content-type=application/json"})
	public Map fingerUpdate(@RequestBody EmployeeVO employee) throws JSONException, IOException{
		URLReader url = new URLReader();
		JSONObject json = url.getFinger();
		
		if(employee!=null) 
			employee.setEmFingerPrint(json.getString("hash"));
		employeeService.fingerInsert(employee);
		Map result=new HashMap();
		result.put("result", Boolean.TRUE);
		return result;
	}
	

	
}
