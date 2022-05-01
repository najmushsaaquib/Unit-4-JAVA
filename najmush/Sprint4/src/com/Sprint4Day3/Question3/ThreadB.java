package com.Sprint4Day3.Question3;

public class ThreadB extends Thread {

	Common c;
	String name;

	public ThreadB(Common c, String name) {
		this.c = c;
		this.name = name;
	}

	@Override
	public void run() {
		c.fun1(name);
	}
}
