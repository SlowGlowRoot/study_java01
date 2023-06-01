package com.mycompany.study.ch04;

public class ExForOneToTen {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		    System.out.println("i = " + i + ", sum = " + sum);
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		System.out.println("");
		System.out.println("----------------------------i");
		System.out.println("");
		
		int sumEven = 0;
		
		for (int j = 11; j >= 11 && j <= 50; j++) {
			if (j % 2 == 0) {
				sumEven = sumEven + j;
				System.out.println("j = " + j + ", sumEven = " + sumEven);
			}
		}
		System.out.println("11부터 50까지의 모든 짝수의 합은 " + sumEven + "입니다.");
		
	}

}
