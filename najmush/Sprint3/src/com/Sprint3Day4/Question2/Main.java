package com.Sprint3Day4.Question2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		TreeSet<Employee> emp = new TreeSet<>( new Demo() );

		Scanner scn = new Scanner(System.in);

		System.out.println("Welcome to Our Program where we store your data on basis of salary");
		System.out.println();
		System.out.println("Please enter the number of employee you want us to store data of.");

		int numOfEmp = scn.nextInt();

		while (numOfEmp > 0) {
			System.out.println();
			System.out.println("Enter the Employee ID, Employee Name and Employee Salary");
			int empId = scn.nextInt();
			String name = scn.next();
			double salary = scn.nextDouble();

			emp.add(new Employee(empId, name, salary));
			numOfEmp--;
		}
		

		for (Employee x : emp) {
			System.out.println();
			System.out.println(x);

		}

		scn.close();
	}

}
