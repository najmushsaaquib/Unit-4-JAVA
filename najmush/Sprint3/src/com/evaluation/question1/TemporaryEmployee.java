package com.evaluation.question1;

public class TemporaryEmployee extends Employee {

	private int hoursWorked;
	private int hourlyWages;

	public TemporaryEmployee() {
		// TODO Auto-generated constructor stub
	}

	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		// TODO Auto-generated constructor stub
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getHourlyWages() {
		return hourlyWages;
	}

	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}

	@Override
	void calculateSalary() {
		
		this.salary = this.hoursWorked * this.hourlyWages;

	}

}
