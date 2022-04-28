package com.Sprint3Day2.Question1;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("Welcome to Amrood Bank. ");
		System.out.println("Please enter your Account Number");
		String accNum = scn.next();

		Account acc = new Account(accNum);

		System.out.println("Enter the amount to be deposited");
		acc.balance = scn.nextInt();

		System.out.println("Enter the amount you want to withdraw");
		try {
			acc.withdrawn(scn.nextDouble());
		} catch (InsufficientFundsException error) {

			System.out.println(error.getMessage());
		}

		scn.close();
		System.out.println();
		System.out.println("Application terminated normally with grace.");
	}

}
