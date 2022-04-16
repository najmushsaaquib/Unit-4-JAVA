package com.evaluation;

public class Course {

	int courseId;
	String courseName;
	int courseFee;
	
	void displayCourseDetails() {
		
		System.out.println("CourseId : " + courseId);
		System.out.println("CourseName : " + courseName);
		System.out.println("CourseFee : " + courseFee);
	}
	
	static void authenticate(String username, String password) {
			
		if(username == "Admin" && password == "1234") {
			
			Course course = new Course();
			course.courseId = 135;		
			course.courseName = "JAVA Backend" ;
			course.courseFee = 300000;
			
			course.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}
	
	public static void main(String[] args) {

		authenticate("Admin", "1234");
		authenticate("Admin", "2222");
		
	}

}
