package com.boot.ds.service;

import java.util.List;

import com.boot.ds.dto.EmployeeDO;
import com.boot.ds.entity.Employee;

public interface EmployeeService {
	EmployeeDO create(EmployeeDO employeeeDTO);

	EmployeeDO retrive(long id);

	List<Employee> getAllEmployees();
}
