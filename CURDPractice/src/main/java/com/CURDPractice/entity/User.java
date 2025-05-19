package com.CURDPractice.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="UserDetailes")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO.IDENTITY)
	long id;
	
	String name;
	
	String domain;
	
	double salary;

	public User(long id, String name, String domain, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.domain = domain;
		this.salary = salary;
	}
	public User() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
