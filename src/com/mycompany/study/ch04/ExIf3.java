package com.mycompany.study.ch04;

public class ExIf3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// int 타입의 변수를 하나 선언하고 짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시오
		
		int number = -1;
		
		if (number % 2 == 1) {
			System.out.println("입력하신 " + number + "은 홀수입니다.");
		} else if (number == 0) {
			System.out.println("0은 홀수도 짝수도 아닙니다.");
		} else if (number < 0) {
			System.out.println("양의 정수를 입력하여 주십시오.");
		} else {
			System.out.println("입력하신 " + number + "은 짝수입니다.");
		}
		
	}

}
