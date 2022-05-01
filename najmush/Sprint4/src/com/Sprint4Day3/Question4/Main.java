package com.Sprint4Day3.Question4;

public class Main {

	public static void main(String[] args) {
		
		Common com = new Common();
		
		ThreadA t1  = new ThreadA(com);
		ThreadB t2  = new ThreadB(com);
		Thread one = new Thread(t1);
		Thread two = new Thread(t2);
		
		one.setName("Raja");
		two.setName("Rahul ");
		
		one.start();
		two.start();
		
	}
	
	
}
