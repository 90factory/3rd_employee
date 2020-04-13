package com.bomin.employeePractice.employee.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bomin.employeePractice.employee.EmployeeVO;
import com.bomin.employeePractice.employee.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

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

	
	@RequestMapping(value = "/bomin/{name}", method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
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
	
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public Map employeeSelectByID(@PathVariable int id) {
		System.out.println("by id 시작" + id);
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
	
	

	
}
