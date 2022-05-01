package com.Sprint4Day3.Question4;

public class Common {

	public  synchronized  void one() {

		
		try {
			
			Thread.sleep(100);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		for (int x = 0; x <= 5; x++) {

			System.out.println("I am fun one " + Thread.currentThread().getName());
		}
		
		
	}

	public synchronized void two() {

		for (int x = 0; x <= 5; x++) {

			System.out.println("I am fun two " + Thread.currentThread().getName());
		}

	}

	public void three() {

		for (int x = 0; x <= 5; x++) {

			System.out.println("I am fun three " + Thread.currentThread().getName());
		}

	}

}
