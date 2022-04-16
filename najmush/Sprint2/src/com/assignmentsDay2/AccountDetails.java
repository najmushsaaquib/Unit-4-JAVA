package com.assignmentsDay2;

import java.util.Scanner;

public class AccountDetails {

	public Account getAccountDetails() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter account id:");
		int accountId = scan.nextInt();

		System.out.println("Enter account type:");
		String accountType = scan.next();

		System.out.println("Enter balance:");
		int balance = scan.nextInt();

		if (balance < 0) {

			while (balance < 0) {
				System.out.println("Balance should be positive");
				System.out.println();
				System.out.println("Enter balance:");
				int updatedBalance = scan.nextInt();
				balance = updatedBalance;
			}
		}

		System.out.println();
		Account freshAccount = new Account();
		freshAccount.setAccountId(accountId);
		freshAccount.setAccountType(accountType);
		freshAccount.setBalance(balance);

		return freshAccount;
	}

	public int getWithdrawAmount() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn:");
		int amount = scan.nextInt();
		if (amount < 0) {
			while (amount < 0) {
				System.out.println("Amount should be positive");
				System.out.println();
				System.out.println("Enter Amount:");
				int updatedAmount = scan.nextInt();
				amount = updatedAmount;
			}
		}
		System.out.println();
		return amount;
	}

	public static void main(String[] args) {

		AccountDetails accDetails = new AccountDetails();
		Account newAccount = accDetails.getAccountDetails();
		int amount = accDetails.getWithdrawAmount();
		newAccount.withdraw(amount);

	}

}
