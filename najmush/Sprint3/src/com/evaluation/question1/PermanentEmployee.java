package com.evaluation.question1;

public class PermanentEmployee extends Employee {

	private double basicPay;

	public PermanentEmployee() {
		// TODO Auto-generated constructor stub
	}

	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.salary = basicPay;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	@Override
	void calculateSalary() {
		
	}

}
