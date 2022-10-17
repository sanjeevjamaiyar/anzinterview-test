package com.example.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.example.employee.model.Account;
import com.example.employee.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accRepository;

	// CREATE
	public Account createEmployee(Account emp) {
		return accRepository.save(emp);
	}

	// READ
	public List<Account> getEmployees() {
		return accRepository.findAll();
	}
	
	
	//READ by ID 
	
	
	
	public Optional<Account> getEmployeesByID(Long emp) {
		Optional<Account> employeeResponse =  accRepository.findById(emp);
		Account employee = employeeResponse.get();
		
		return accRepository.findById(emp);
		//return employee;
	}
	
	
	
	

	// UPDATE
	public Account updateEmployee(Long empId, Account employeeDetails) {
		Account emp = accRepository.findById(empId).get();
		emp.setAccountName(employeeDetails.getAccountName());	
		
		emp.setAccountType(employeeDetails.getAccountType());
		emp.setBalanceDate(employeeDetails.getBalanceDate());
		
		emp.setCurrencyInfo(employeeDetails.getCurrencyInfo());
		emp.setAvailableBalance(employeeDetails.getAvailableBalance());

		emp.setEmpId(employeeDetails.getEmpId());
		
		return accRepository.save(emp);
	}

	// DELETE
	public void deleteEmployee(Long empId) {
		accRepository.deleteById(empId);
	}
}
