package com.raghu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.raghu.entity.Employee;
import com.raghu.model.EmployeeDTO;
import com.raghu.service.EmployeeService;

@Controller
@ResponseBody
public class EmployeeController {
    @Autowired
	private EmployeeService employeeService;
    @RequestMapping(value="/")
   public ModelAndView getMenu()
   {
    	return new ModelAndView("menu");
	   
   }
    @RequestMapping(value="/register")
    public ModelAndView registerPage(@ModelAttribute("dto") EmployeeDTO dto)
    {
    	return new ModelAndView("regEmployee");
    }
    @RequestMapping(value="/save" , method=RequestMethod.POST)
    public ModelAndView saveEmployee(@ModelAttribute("dto") EmployeeDTO dto)
    {
    	String name=null;
    	ModelAndView m=null;
    	try{
    	if(dto.getId()==0)
    	{
    		name=employeeService.createEmployee(dto);
    		m=new ModelAndView("registrationSuccess","addEmp",name);
    		System.out.println("Employee successfully register employee"+name);
    		return m;
    	}
    	}catch(Exception ex)
    	{
    		ex.printStackTrace();
    	}
    	return m;
    }
    @RequestMapping(value="/getAll" , method=RequestMethod.GET)
   public ModelAndView GetAllEmployee()
    {
    	List<Employee> employee=employeeService.getAll();
    	ModelAndView mav=new ModelAndView("viewEmp","allemp",employee);
    	return mav;
    }
 /*  @RequestMapping(value="/edit{id}")
   public ModelAndView updateDetails(@PathVariable("id") int id, Employee employee) throws Exception
   {
	   Employee emp=employeeService.getEmployeeById(id);
	   if(employee.equals(null))
		   throw new Exception("Could not find employee with id- " + id);
	  
	   employee.setName(emp.getName());
	   employee.setSalary(emp.getSalary());
	   employee.setDept(emp.getAddr());
	   employee.setDept(emp.getDept());
	   employeeService.updatEmployee(employee);
	   ModelAndView mav=new ModelAndView("updateEmployee","udate",employee);
	   return mav;
	   
   }*/
    
    
    
}
