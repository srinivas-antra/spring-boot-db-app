package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeAPI {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>>  getEmployees() {
		
		return ResponseEntity.ok(service.fetchAllEmployees());
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
		service.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body("Employee is created");
	}

}
