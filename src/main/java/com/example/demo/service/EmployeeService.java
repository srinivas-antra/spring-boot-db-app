package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee e);
	List<Employee> fetchAllEmployees();

}
