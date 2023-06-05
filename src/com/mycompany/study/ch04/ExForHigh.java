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
		
		
		System.out.println(" ");
		System.out.println("----------");
		System.out.println(" ");
		
		
		int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == 9) {
					System.out.print("1 3 5 7 90");
					break;
				} else {
					System.out.print(number[j]);
				}
			}
			System.out.println("");
		}
		
		
//		for (int i = 0; i <= 10; i++) {
//			if (i == 10) {
//				for (int j = 1; j <= i-1; j++) {
//					if (j % 2 == 1) {
//						System.out.print(j);
//					} else {
//						System.out.print(" ");
//					}
//				}
//				System.out.println("0");
//			} else {
//				for (int j = 1; j <= i-1; j++) {
//					System.out.print(j);
//				}
//				System.out.println("");
//			}
//		}
		
	}

}
