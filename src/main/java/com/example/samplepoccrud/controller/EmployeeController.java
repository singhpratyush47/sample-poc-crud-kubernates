package com.example.samplepoccrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.samplepoccrud.entity.Employee;
import com.example.samplepoccrud.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/getAll")
	public List<Employee> getAllEmployee(){
		return employeeService.getEmployeeList();
	}
}
