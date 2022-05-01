package com.practice;

public class StudentOne {

	private int roll;
	private String name;
	private int mark;

	public StudentOne() {
	}

	public StudentOne(int roll, String name, int mark) {
		this.roll = roll;
		this.name = name;
		this.mark = mark;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (obj == this)
			return true;

		StudentOne s1 = this;
		StudentOne s2 = (StudentOne) obj;

		return s1.getMark() == s2.getMark() && s1.getRoll() == s2.getRoll() && s1.getName().equals(s2.getName());

	}
	
	@Override
	public int hashCode() {
		return this.roll;
	}
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "StudentOne [roll=" + roll + ", name=" + name + ", mark=" + mark + "]";
	}

}
