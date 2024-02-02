package com.boot.ds.mapper;

import com.boot.ds.dto.EmployeeDO;
import com.boot.ds.entity.Employee;

public class EmployeeMapper {

	// DTO _ ENTIRY
	public static EmployeeDO employeeEntityConverter(Employee entity) {
		return new EmployeeDO(entity.getId(), entity.getFirstname(), entity.getLastname(), entity.getEmail());
	}

	// ENTIRY DTO
	public static Employee employeeDTOConverter(EmployeeDO dto) {
		return new Employee(dto.getId(), dto.getFirstname(), dto.getLastname(), dto.getEmail());
	}
}
