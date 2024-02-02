package com.boot.ds.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.ds.dto.EmployeeDO;
import com.boot.ds.entity.Employee;
import com.boot.ds.mapper.EmployeeMapper;
import com.boot.ds.repository.EmployeeRepository;
import com.boot.ds.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDO create(EmployeeDO employeeeDTO) {
		Employee employee = EmployeeMapper.employeeDTOConverter(employeeeDTO);
		EmployeeDO employeDTO = EmployeeMapper.employeeEntityConverter(employeeRepository.save(employee));
		return employeDTO;
	}

	@Override
	public EmployeeDO retrive(long id) {

		EmployeeDO employeDTO = EmployeeMapper.employeeEntityConverter(employeeRepository.getOne(id));
		return employeDTO;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> emplyees = employeeRepository.findAll();
		return emplyees;
	}
}
