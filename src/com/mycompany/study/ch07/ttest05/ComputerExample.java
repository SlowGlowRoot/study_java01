package com.mycompany.study.ch07.ttest05;

public class ComputerExample {

	public static void main(String[] args) {

		int r = 7;
		System.out.println("훈련생 이름 : 서희근");
		System.out.println("원의 반지름 : " + r);
		System.out.println();
		
		Calculator calculator = new Calculator();
		double radius1 = calculator.param(r);
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적 : " + radius1);
		System.out.println();
		
		Computer computer = new Computer();
		double radius2 = computer.param(r);
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적 : " + radius2);
		
	}

}
