package com.example.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Account;
import com.example.employee.model.Employee;
import com.example.employee.service.AccountService;
import com.example.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeService empService;
	
	@RequestMapping(value="/employees", method=RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee emp) {
	    return empService.createEmployee(emp);
	}

	@RequestMapping(value="/employees", method=RequestMethod.GET)
	public List<Employee> readEmployees() {
	    return empService.getEmployees();
	}
	
	@RequestMapping(value="/employees/{empId}", method=RequestMethod.PUT)
	public Employee updateEmployee(@PathVariable(value = "empId") Long id, @RequestBody Employee empDetails) {
	    return empService.updateEmployee(id, empDetails);
	}
	
	@RequestMapping(value="/employees/{empId}", method=RequestMethod.DELETE)
	public void deleteEmployees(@PathVariable(value = "empId") Long id) {
	    empService.deleteEmployee(id);
	}
	
	
	////////////
	
	/*
	 * @RequestMapping(value="/employees", method=RequestMethod.GET) public
	 * List<Employee> readEmployees() { return empService.getEmployees(); }
	 */
	
	
	@RequestMapping(value="/employees/{empId}", method=RequestMethod.GET)
	public Optional<Employee> readEmployeesByID(@PathVariable(value = "empId") Long id) {
	    return empService.getEmployeesByID(id);
	}
	
	
	//////////////
	
	
	////for account info ///////
	
	@Autowired
	AccountService accService;
	
	@RequestMapping(value="/accounts", method=RequestMethod.POST)
	public Account createEmployee(@RequestBody Account emp) {
	    return accService.createEmployee(emp);
	}

	@RequestMapping(value="/accounts", method=RequestMethod.GET)
	public List<Account> readEmployees1() {
	    return accService.getEmployees();
	}
	
	@RequestMapping(value="/accounts/{empId}", method=RequestMethod.PUT)
	public Account updateEmployee(@PathVariable(value = "empId") Long id, @RequestBody Account empDetails) {
	    return accService.updateEmployee(id, empDetails);
	}
	
	@RequestMapping(value="/accounts/{empId}", method=RequestMethod.DELETE)
	public void deleteEmployees1(@PathVariable(value = "empId") Long id) {
	    accService.deleteEmployee(id);
	}
	
	
	////////////
	
	/*
	 * @RequestMapping(value="/accounts", method=RequestMethod.GET) public
	 * List<Account> readEmployees() { return accService.getEmployees(); }
	 */
	
	
	@RequestMapping(value="/accounts/{empId}", method=RequestMethod.GET)
	public Optional<Account> readEmployeesByID1(@PathVariable(value = "empId") Long id) {
	    return accService.getEmployeesByID(id);
	}
	
	
	
	////end of account info  /////
	
	
	@RequestMapping(value="/accounts1/{empId}", method=RequestMethod.GET)
	public Optional<Account> readEmployeesByAccountID(@PathVariable(value = "empId") Long id) {
	    return accService.getEmployeesByID(id);
	}
	
	
	
}



