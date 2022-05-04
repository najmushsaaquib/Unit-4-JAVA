package com.evaluation.question2;

public class SecondThread extends Thread {
	
	DemoOne one;
	DemoTwo two;
	
	public SecondThread(DemoOne one ,DemoTwo two) {
		this.one = one;
		this.two = two;
		}
	
		@Override
		public void run() {
		two.funDemoTwo(one);
		}
	
	
	
}
