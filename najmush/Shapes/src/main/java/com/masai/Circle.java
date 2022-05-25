package com.masai;

public class Circle implements Shape {

	void draw() {
		 System.out.println("You have drawn Circle");
	 }

	@Override
	public void drawFig() {
		
		draw();
	}
}
