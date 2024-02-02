package com.boot.ds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.ds.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
