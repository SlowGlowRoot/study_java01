package com.mycompany.study.ch04;

public class ExRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 1;
		int max = 45;
		int random1 = (int) (Math.random() * (max - min)) + min;
		int random2 = (int) (Math.random() * (max - min)) + min;
		
		// System.out.println("random : " + random);
		// jdk : Java Development Kit
		
		int num1 = random1;
		int num2 = random2;
		int total = num1 + num2;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("Total : " + total);

	}

}
