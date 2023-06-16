package com.springmvc.boot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee_details
{
	@Id
	private int emp_id;
	private String emp_name;
	private String emp_desg;
	private double emp_sal;
	
	public Employee_details() {
		super();
	}

	public Employee_details(int emp_id, String emp_name, String emp_desg, double emp_sal) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_desg = emp_desg;
		this.emp_sal = emp_sal;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_desg() {
		return emp_desg;
	}

	public void setEmp_desg(String emp_desg) {
		this.emp_desg = emp_desg;
	}

	public double getEmp_sal() {
		return emp_sal;
	}

	public void setEmp_sal(double emp_sal) {
		this.emp_sal = emp_sal;
	}

	@Override
	public String toString() {
		return "Employee_details [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_desg=" + emp_desg + ", emp_sal="
				+ emp_sal + "]";
	}
	
	
}
