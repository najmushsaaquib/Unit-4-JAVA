package com.Sprint4Day3.Question1;

public class Product implements Runnable {

	int sum = 1;

	@Override
	public void run() {

		for (int x = 1; x <= 10; x++) {

			this.sum *= x;

			System.out.println(sum);

		}

	}

}
