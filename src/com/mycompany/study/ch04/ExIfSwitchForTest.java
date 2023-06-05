package com.mycompany.study.ch04;

public class ExIfSwitchForTest {

	public static void main(String[] args) {
		
		System.out.println("");
		System.out.println("If문 : 사분면 비교");
		int a = 0;
		int b = 0;
		
		if (a < 0 && b < 0) {
			System.out.println("점 (" + a + ", " + b + ")은(는) 1사분면에 위치합니다." );
		} else if (a > 0 && b < 0) {
			System.out.println("점 (" + a + ", " + b + ")은(는) 2사분면에 위치합니다." );
		} else if (a > 0 && b > 0) {
			System.out.println("점 (" + a + ", " + b + ")은(는) 3사분면에 위치합니다." );
		} else if (a < 0 && b > 0) {
			System.out.println("점 (" + a + ", " + b + ")은(는) 4사분면에 위치합니다." );
		} else if (a != 0 && b == 0) {
			System.out.println("점 (" + a + ", " + b + ")은(는) x축 위에 위치합니다." );
		} else if (a == 0 && b != 0) {
			System.out.println("점 (" + a + ", " + b + ")은(는) y축 위에 위치합니다." );
		} else {
			System.out.println("점 (0, 0)은 원점에 위치합니다.");
		}
		
		
		
		System.out.println("");
		System.out.println("If문 : 세 정수에서 최대, 최솟값 비교");
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		
		if (num1 >= num2 && num1 >= num3) {
			int max_num = num1;
			System.out.println("세 정수 중 최댓값은 " + max_num + ",");
		} else if (num2 >= num1 && num2 >= num3) {
			int max_num = num2;
			System.out.println("세 정수 중 최댓값은 " + max_num + ",");
		} else {
			int max_num = num3;
			System.out.println("세 정수 중 최댓값은 " + max_num + ",");
		}
		
		if (num1 <= num2 && num1 <= num3) {
			int min_num = num1;
			System.out.println("최솟값은 " + min_num + "입니다.");
		} else if (num2 <= num1 && num2 <= num3) {
			int min_num = num2;
			System.out.println("최솟값은 " + min_num + "입니다.");
		} else {
			int min_num = num3;
			System.out.println("최솟값은 " + min_num + "입니다.");
		}
		
		
		
		System.out.println("");
		System.out.println("While문 : 1에서 10까지 모든 정수의 합");
		int sum_while = 0;
		int i_while = 1;
		
		while (i_while <= 10) {
			sum_while = sum_while + i_while;
			System.out.println("i = " + i_while + ", sum = " + sum_while);
			i_while++;
		}
		System.out.println("1부터 10까지 모든 정수를 더한 값은 " + sum_while + "입니다.");
		
		
		
		System.out.println("");
		System.out.println("For문 : 1에서 10까지 모든 정수의 합, 11부터 50까지 모든 짝수의 합");
		int sum_for = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum_for = sum_for + i;
			System.out.println("i = " + i + ", sum = " + sum_for);
		}
		System.out.println("1부터 10까지 모든 정수의 합은 " + sum_for + "입니다.");
		
		System.out.println("");
		int sumEven_for = 0;
		
		for (int j = 11; j >= 11 && j <= 50; j++) {
			if (j % 2 == 0) {
				sumEven_for = sumEven_for + j;
				System.out.println("j = " + j + ", sum = " + sumEven_for);
			}
		}
		System.out.println("11부터 50까지 모든 짝수의 합은 " + sumEven_for + "입니다.");
		
		
		
		System.out.println("");
		System.out.println("For문 : 2단부터 9단까지 구구단");
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println("");
		}
		
		
		System.out.println("For문 : 애스터리스트(*)");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for (int i = 1; i <= 5; i++) {
			if (i == 1 || i == 5) {
				for (int j = 1; j <= 10; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= 10; j++) {
					if (j == 1 || j == 10 ) {
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
