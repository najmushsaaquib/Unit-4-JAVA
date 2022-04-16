package com.evaluation;

public class AlarmClock {

	
 static	void vacationClock(int n, boolean value) {
		
		if ((n < 0 || n > 6) || (value != true && value !=false)) {
			System.out.println("error");
		}
		
		else if(n >=0 && n<=4 && value == true) {  //vacation and weekday
			System.out.println("10:00");
		}
		else if(n >=5 && n<=6 && value == true) { //vacation and weekend
			System.out.println("off");
		}
		else if(n >=0 && n<=4 && value == false) { // not a vacation and weekday,
			System.out.println("7:00");
		}
		else if(n >=5 && n<=6 && value == false) { //not a vacation and weekend,
			System.out.println("10:00");
		}
	}
	
	public static void main(String[] args) {
		
		vacationClock(2,true);
		
	}

}
