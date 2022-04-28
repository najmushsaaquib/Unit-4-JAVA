package com.Sprint3Day1.Question4;

import java.util.Scanner;

public class Employee {

	public double calculateAverage(int[] age) {

		double sum = 0;
		double average = 0;

		for (int x : age) {
			if (x < 28 || x > 40) {
				return 0;
			} else {
				sum += x;
			}
		}

		average = sum / age.length;

		return average;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter total number of employees: ");
		int totalEmp = scn.nextInt();

		if (totalEmp < 2) {
			System.out.println("Please enter a valid employee count");
		} else {
			System.out.println("Enter the age for " + totalEmp + " employees:");
			int[] employeArr = new int[totalEmp];
			for (int i = 0; i < totalEmp; i++) {
				employeArr[i] = scn.nextInt();
			}

			Employee newEmp = new Employee();

			double averageAge = newEmp.calculateAverage(employeArr);
			if (averageAge != 0) {
				System.out.println("The average age is " + averageAge);
			} else {
				System.out.println("Invalid age encountered!");
			}

		}
		scn.close();

	}

}
