package com.boot.ds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.ds.dto.EmployeeDO;
import com.boot.ds.entity.Employee;
import com.boot.ds.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public ResponseEntity<EmployeeDO> addEmployee(@RequestBody EmployeeDO employeeDO) {
		EmployeeDO savedEmployee = employeeService.create(employeeDO);
		return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);

	}

	@GetMapping
	private ResponseEntity<EmployeeDO> getEmployee(@RequestParam long id) {
		EmployeeDO savedEmployee = employeeService.retrive(id);
		return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
	}

	@GetMapping("/getAllEmployee")
	private ResponseEntity<List<Employee>> getAllEmployee() {
		List<Employee> savedEmployees = employeeService.getAllEmployees();
		return new ResponseEntity<List<Employee>>(savedEmployees, HttpStatus.CREATED);
	}
}
