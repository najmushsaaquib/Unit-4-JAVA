package com.masai;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
			
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		
//		 Shape obj =   ctx.getBean("cr", Shape.class);
//		
//		 obj.drawFig();
		
		int[][] mat= { {5, 4, 17, 1,}, {2,5,9,0} };
		
		System.out.println(Math.max(5, (Math.max(17, 19)) ));
		
		System.out.println(Arrays.stream(mat[0]).max().getAsInt());
		 
	}

}
