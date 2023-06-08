package com.mycompany.study.ch06.trfirst;

public class TrCar {
	
	int engine = 4;
	String company = "현대";
	String name = "소나타";
	String color = "하양";
	
	void goStraight() {
		System.out.println("앞으로 갑니다.");
	}
	
	void goBack() {
		System.out.println("뒤로 갑니다.");
	}
	
	void speedUp() {
		System.out.println("가속합니다.");
	}
	
	void speedDown() {
		System.out.println("감속합니다.");
	}
	
}
