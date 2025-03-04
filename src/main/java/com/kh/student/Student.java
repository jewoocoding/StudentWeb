package com.kh.student;

public class Student {
	// 필드
	private String name;
	private int firstScore;
	private int secondScore;
	
	// 생성자
	public Student() {}
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	// getter/setter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getFirstScore() {
		return firstScore;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public int getSecondScore() {
		return secondScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	
	// 메소드
	@Override
	public String toString() {
		return "Student [name=" + name + ", firstScore=" + firstScore + ", secondScore=" + secondScore + "]";
	}
}
