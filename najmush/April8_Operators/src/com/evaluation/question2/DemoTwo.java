package com.evaluation.question2;

public class DemoTwo {

	public synchronized void funDemoTwo(DemoOne first) {

		System.out.println("funDemoTwo of DemoTwo starts");
		System.out.println();
		first.fun1();
		System.out.println();
		System.out.println("funDemoTwo of DemoTwo ends");
	}

	public synchronized void fun2() {
		System.out.println();
		System.out.println("inside fun2 of DemoTwo");
	}
	
	// To remove deadlock
	
//	public  void fun2() {
//		System.out.println();
//		System.out.println("inside fun2 of DemoTwo");
//	}
//	
	
}
