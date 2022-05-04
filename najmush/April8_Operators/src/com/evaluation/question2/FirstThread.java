package com.evaluation.question2;

public class FirstThread extends Thread{
	
	DemoOne one;
	DemoTwo two;
	
	public FirstThread(DemoOne one ,DemoTwo two) {
		this.one = one;
		this.two = two;
		}
	
		@Override
		public void run() {
		one.funDemoOne(two);
		}
	
	
	
}	
