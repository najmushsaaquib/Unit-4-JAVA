package com.Sprint3Day1.Question2;

public interface X {

	void xMethod();
	default void xDefault() {
		System.out.println("Inside default method of X interface");
	}
	static void xStatic() {
		System.out.println("Inside static method of X interface");
	};
	
}
