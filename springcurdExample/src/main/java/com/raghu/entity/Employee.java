package com.raghu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee1")
public class Employee {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String salary;
	private String addr;
	private String dept;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String salary, String addr, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.addr = addr;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	

}
