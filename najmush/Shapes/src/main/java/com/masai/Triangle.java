package com.masai;

public class Triangle implements Shape {
	void draw() {
		System.out.println("You have drawn Triangle");
	}
	

	@Override
	public void drawFig() {
		
		draw();
	}

}
