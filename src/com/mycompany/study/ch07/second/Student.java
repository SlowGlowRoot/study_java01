package com.mycompany.study.ch07.second;

public class Student extends People {

	public int studentNo;
	
	// super : 상위 클래스의 생성자를 호출하는 예약어, 메소드 첫번째 줄에 작성해야 함
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
//		this.name = name;
//		this.ssn = ssn;
		this.studentNo = studentNo;
	}
	
	public Student(String name, String ssn) {
		super(name, ssn);
	}
	
	public Student() {
//		super();
	}
}	
