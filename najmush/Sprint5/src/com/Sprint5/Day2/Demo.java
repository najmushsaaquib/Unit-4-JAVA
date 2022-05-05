package com.Sprint5.Day2;

public class Demo {

	public Demo() {
		System.out.println("inside demo constructor..");
	}

	{
		System.out.println("inside non-static block");
	}

	static {
		System.out.println("Inside static block");
	}

	void funA() {
		System.out.println("inside fun A");
	}

	public static void main(String[] args) {

		System.out.println("inside main begin..");

		Demo d = new Demo();

		d.funA();

	}
}
