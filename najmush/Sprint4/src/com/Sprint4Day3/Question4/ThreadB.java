package com.Sprint4Day3.Question4;

public class ThreadB implements Runnable {

	Common com;

	public ThreadB(Common c) {
		this.com = c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		com.one();
		com.two();
		com.three();
	}

}
