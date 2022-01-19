package com.zach.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zach.model.Employee;

@RestController
public class EmpController {
	
	@GetMapping("/emps")
	public List<Employee> getAllEmps() {
		return Arrays.asList(new Employee(100,"Zach","Dallas"));
	}
	
}
