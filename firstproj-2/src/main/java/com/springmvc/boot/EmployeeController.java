package com.springmvc.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springmvc.boot.model.Employee_details;




@RestController
public class EmployeeController 
{
	 @Autowired
	EmpRepo repo;
	 
	@GetMapping(path="employee",produces = {"application/xml"})
	public List<Employee_details> getEmployee()
	{
		List<Employee_details> employee=repo.findAll();
		//int i=9/0;
		System.out.println("featching data");
		return employee;
		
		
		
	}
	// fetch value by id
	@RequestMapping("employee/{emp_id}")
	public Employee_details getEmployee1(@PathVariable("emp_id") int emp_id)
	{
		Employee_details employee=repo.findById(emp_id).orElse(new Employee_details(0,"not found","not found",0.0));
		
		return employee;
		
	}
// inserting data
	@PostMapping(path="employee",consumes = {"application/json"})
	public Employee_details addEmployee(@RequestBody Employee_details employee)
	{
		repo.save(employee);
		System.out.println("data inserted");
		return employee;
		
	}
	
	//update data
	@PutMapping(path="employee",consumes = {"application/json"})
	public Employee_details updateEmployee(@RequestBody Employee_details employee)
	{
		repo.save(employee);
		System.out.println("data updated");
		return employee;
		
	}
		
	//delete employee
	@DeleteMapping("employee/{emp_id}")
	public String deleteEmployee1(@PathVariable("emp_id") int emp_id)
	{
		Employee_details employee=repo.findById(emp_id).orElse(new Employee_details(0,"not found","not found",0.0));
		repo.delete(employee);
		
		return "data deleted";
		
	}
	
	
	
}
