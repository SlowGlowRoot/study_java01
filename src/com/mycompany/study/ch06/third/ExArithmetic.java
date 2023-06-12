package com.mycompany.study.ch06.third;
import java.util.Scanner;

public class ExArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arithmetic math = new Arithmetic();
		
		int plus = math.add(5, 2);
		int minus = math.sub(5, 2);
		int multiple = math.mul(5, 2);
		double divide = math.div(5, 2);
		
		System.out.println("5 + 2 = " + plus);
		System.out.println("5 - 2 = " + minus);
		System.out.println("5 * 2 = " + multiple);
		System.out.println("5 / 2 = " + divide);
		
		
		
		String name = math.changeName("장원");	// Argument(인자)
		System.out.println("name : " + name);
		
		math.changeName2("아이브");
		
		int takeMyMoney = math.takeMyMoney();
		System.out.println("당신은 바닥에서 " + takeMyMoney + "원을 주웠습니다.");

	}

}
