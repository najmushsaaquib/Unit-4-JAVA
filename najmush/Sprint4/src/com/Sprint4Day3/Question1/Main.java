package com.Sprint4Day3.Question1;

public class Main {

	public static void main(String[] args) {
		
		Product pro = new Product();
		
		Thread threadOne = new Thread(pro);
		
		threadOne.setPriority(10);
		
		threadOne.setName("Raj");
		
		threadOne.start();
		
		try {
			threadOne.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int product = pro.sum;
		
		System.out.println("Total product of ten digits are " + product);
		
	}
}
