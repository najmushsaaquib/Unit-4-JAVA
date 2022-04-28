package com.Sprint3Day2.Question1;

public class InsufficientFundsException extends Exception {

	public InsufficientFundsException() {
	}

	public InsufficientFundsException(String errorMessage) {

		super(errorMessage);
	}
}
