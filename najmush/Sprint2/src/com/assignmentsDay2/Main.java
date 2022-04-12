package com.assignmentsDay2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Employee ID");
		int id = scan.nextInt();
		System.out.println("Enter Employee Name");
		String name = scan.next();
		System.out.println("Enter Salary");
		double sal = scan.nextDouble();
		System.out.println("Enter PF Percentage");
		int pf = scan.nextInt();

		Employee emp = getEmployeeDetails(id, name, sal);
		
		emp.calculateNetSalary(pf);

		System.out.println("Your ID is: " + emp.getEmployeeId());
		System.out.println("Your Name is: " + emp.getEmployeeName());
		System.out.println("Your Salary is: " + emp.getSalary());
		System.out.println("Your Net Salary is: " + emp.getNetSalary());

	}

	public static Employee getEmployeeDetails(int id, String name, double sal) {

		Employee emp1 = new Employee();

		emp1.setEmployeeId(id);
		emp1.setEmployeeName(name);
		emp1.setSalary(sal);

		return emp1;
	}

}
