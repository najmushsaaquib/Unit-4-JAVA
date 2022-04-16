package com.assignments;

public class City {

	public static void main(String[] args) {
		whichCity("Bangalore");
	}
	
	static void whichCity(String city) {
	
		switch(city){
			
		case "Mumbai" :
			System.out.println("Financial City");
			break;
		case "Kolkata":
  			System.out.println("City of Joy");
  			break;
		case "Delhi":
  			System.out.println("Capital of the Country");
  			break;
		case "Bangalore":
  			System.out.println("Cyber City");
  			break;
  		default:
  			System.out.println("May be other Indian City");
  			break;
			
		}
		
	}
	
}
