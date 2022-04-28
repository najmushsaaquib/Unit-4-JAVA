package com.Sprint3Day2.Question1;

public class Account {

	String accountNumber;

	double balance;

	public Account() {
	}

	public Account(String accountNum) {
		this.accountNumber = accountNum;
	}

	void  deposti(int amount) {
		this.balance += amount;
	}

	double withdrawn(double amt) throws InsufficientFundsException {

		double withdraw = 0;

		if (this.balance >= amt) {
			this.balance -= amt; 
			withdraw = this.balance - amt;
			System.out.println();
			System.out.println("Remaining ammount in your account is " + balance);
			return withdraw;
			
		} else {
			
			InsufficientFundsException exc = new InsufficientFundsException("Oops, insufficient balance.");
			throw exc;
		}


	}
}
