package com.mycompany.study.ch04;

public class ExIf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 3;
		int num2 = 2;
		int num3 = 1;
		int max_num;
		int min_num;
		
		if (num1 >= num2 && num1 >= num3) {
			max_num = num1;
			System.out.println("세 정수 중 최댓값은 " + max_num + ",");
		} else if (num2 >= num1 && num2 >= num3) {
			max_num = num2;
			System.out.println("세 정수 중 최댓값은 " + max_num + ",");
		} else {
			max_num = num3;
			System.out.println("세 정수 중 최댓값은 " + max_num + ",");
		}
		
		if (num1 <= num2 && num1 <= num3) {
			min_num = num1;
			System.out.println("최솟값은 " + min_num + "입니다.");
		} else if (num2 <= num1 && num2 <= num3) {
			min_num = num2;
			System.out.println("최솟값은 " + min_num + "입니다.");
		} else {
			min_num = num3;
			System.out.println("최솟값은 " + min_num + "입니다.");
		}
		
		
	}

}
