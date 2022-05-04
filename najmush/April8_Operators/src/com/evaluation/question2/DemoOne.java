package com.evaluation.question2;

public class DemoOne {

	public synchronized void funDemoOne(DemoTwo second) {
		
		System.out.println("funDemoOne of DemoOne starts");
		System.out.println();
		second.fun2();
		System.out.println();
		System.out.println("funDemoOneof DemoOne ends");
	}

	public synchronized void fun1() {
		System.out.println();
		System.out.println("inside fun1 of DemoOne");
	}

	
	// To remove deadlock 
	
//	public  void fun1() {
//		System.out.println();
//		System.out.println("inside fun1 of DemoOne");
//	}
	
	
}
