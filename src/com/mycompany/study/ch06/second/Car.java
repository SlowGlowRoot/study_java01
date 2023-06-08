package com.mycompany.study.ch06.second;

public class Car {

	// 기본생성자
	
	int engine;
	String name;
	String color;
	String company;
	
	// 기본생성자, 작성하지 않아도 자동으로 생성되지만 다른 Car() 함수를 만들었을 경우 따로 작성해야함. 
	Car() {
		
	}
	
	Car(String color) {
		this.color = color;
	}
	
	Car(int engine, String name, String color, String company) {
		this.engine = engine;
		this.name = name;
		this.color = color;
		this.company = company;
	}
	
	void go() {
		System.out.println("앞으로 갑니다.");
	}
	
	void back() {
		System.out.println("뒤로 갑니다.");
	}
	
}
