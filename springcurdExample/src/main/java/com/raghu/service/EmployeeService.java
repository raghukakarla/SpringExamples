package com.raghu.service;

import java.util.List;

import com.raghu.entity.Employee;
import com.raghu.model.EmployeeDTO;

public interface EmployeeService {
	//public Employee getEmployeeById(int id);
	public String createEmployee(EmployeeDTO dto);
	public List<Employee> getAll();
	//public Employee updatEmployee(Employee employee);

}
