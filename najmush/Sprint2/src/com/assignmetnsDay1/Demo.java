package com.assignmetnsDay1;

public class Demo {
	
		public Demo (){
			this("Call me");
			System.out.println("I am insdie Demo() empty constructor");
		}
			
		public Demo (String s){
			this(21);
			System.out.println("I am insdie Demo(String ) String constructor");
		}
		
		public Demo (int i){
			this(21.11f);
			System.out.println("I am insdie Demo(int) integer constructor");
		}
		
		public Demo (float f){
			System.out.println("I am insdie Demo(float ) float constructor");
			
		}
		
		public static void main(String[] args) {
			
			new Demo();
		}			
			
					
			
		
}
