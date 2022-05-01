package com.Sprint4Day3.Question4;

public class ThreadA implements Runnable {

	Common com;
	
	public ThreadA(Common c) {
		this.com = c;
	}
	
	@Override
	public void run() {
		
		com.one();
		com.two();
		com.three();
		
	}

}
