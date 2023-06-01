package com.mycompany.study.ch04;

public class ExForHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		System.out.println("----------");
		System.out.println(" ");
		
		for (int i = 1; i <= 5; i++) {
			if (i % 4 == 1) {
				for (int j = 1; j <= 10; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= 10; j++) {
					if (j % 9 == 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println(" ");
		}

	}

}
