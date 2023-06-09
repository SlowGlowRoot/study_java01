package com.mycompany.study.ch06.third;

public class Arithmetic {

	// 더하기 함수 (피연산자는 2개로 한정)
	// y = a + b;
	
	public static int add(int a, int b) {
		int y = a + b;
		return y;
	}
	
	public int sub(int a, int b) {
		int y = a - b;
		return y;
	}
	
	public int mul(int a, int b) {
		int y = a * b;
		return y;
	}
	
	public double div(double a, double b) {
		double y = a / b;
		return y;
	}
	
	public String changeName(String name) {
		if (name == "장원영") {
			return "Tony";
		} else if (name == "몰?루") {
			System.out.println("아!루");
			return "";
		} else {
			return "몰?루";
		}
	}
	
	
	// input은 있는데 output이 없음
	public void changeName2(String name) {		// Parameter(매개변수)
		switch (name) {
		case "아이브":
			System.out.println("장원영은 너무 예뻐");
			break;
		default:
			System.out.println("다른 사람은 그냥 예뻐");
			break;
		}
	}
	
	public int takeMyMoney() {
		return 10000;
	}
	
}
