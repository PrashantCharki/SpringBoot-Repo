package com.springmvc.boot.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class employee_table {
	@Id
	private int aid;
	
	private String aname;
	
	
	
	public employee_table() {
		
	}

	public employee_table(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}

	public int getAid() {
		return aid;
	}
	
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}
	

}
