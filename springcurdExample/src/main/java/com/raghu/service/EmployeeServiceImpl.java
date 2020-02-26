package com.raghu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.raghu.entity.Employee;
import com.raghu.model.EmployeeDTO;
import com.raghu.repository.EmployeeDAO;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeDAO dao;
	
public String createEmployee(EmployeeDTO dto)
{
	String name=null;
	Employee emp=null;
	try{
	emp=new Employee();
	emp.setId(dto.getId());
	emp.setName(dto.getName());
	emp.setSalary(dto.getSalary());
	emp.setAddr(dto.getAddr());
	emp.setDept(dto.getDept());
	dao.save(emp);
	name=emp.getName();
	return name;
	}
	catch (Exception e) {
		System.out.println(" At Service layer:-"+e);
		return name;
	}
}

	
	public List<Employee >getAll() {
		// TODO Auto-generated method stub
		
		return (List<Employee>)dao.findAll();
	}

	/*public Employee getEmployeeById(int id)
	{
		return dao.findOne(id);
	}
	public Employee updatEmployee(Employee employee)
	{
		return dao.save(employee);
	}*/
}

