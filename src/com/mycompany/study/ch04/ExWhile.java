package com.mycompany.study.ch04;

public class ExWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1부터 10까지 더하는 프로그램 작성

		int sum = 0;
		int i = 1;
		
		while (i <= 10) {
			sum = sum + i;
			System.out.println("i = " + i + ", sum = "+ sum);
			i++;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
