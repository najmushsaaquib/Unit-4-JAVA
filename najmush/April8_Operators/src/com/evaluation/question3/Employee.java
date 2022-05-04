package com.evaluation.question3;

import java.io.Serializable;

public class Employee implements Serializable{

	private int empId;
	private String name;
	private Address address;
	private String email;
	private  transient String password;

	public Employee() {
	}

	public Employee(int empId, String name, Address address, String email, String password) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", email=" + email
				+ ", password=" + password + "]";
	}

}
