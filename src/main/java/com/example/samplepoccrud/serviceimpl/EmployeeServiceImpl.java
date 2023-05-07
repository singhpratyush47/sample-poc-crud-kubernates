package com.example.samplepoccrud.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.samplepoccrud.entity.Employee;
import com.example.samplepoccrud.repository.EmployeeRepository;
import com.example.samplepoccrud.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public List<Employee> getEmployeeList() {
		return empRepo.findAll();
	}

}
