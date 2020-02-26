package com.raghu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.raghu.entity.Employee;
@Repository
public interface EmployeeDAO extends CrudRepository<Employee, Integer>{

	
}
