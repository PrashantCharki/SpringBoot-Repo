package com.springmvc.boot;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmvc.boot.model.Employee_details;


public interface EmpRepo extends JpaRepository<Employee_details, Integer>
{

}
