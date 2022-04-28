package com.Sprint3Day1.Question2;

public interface Y {
	
	 void yMethod();
	default  void yDefault() {
		System.out.println("Inside default method of Y interface");
	}
	static void yStatic() {
		System.out.println("Inside static method of Y interface");
	};
	
}
