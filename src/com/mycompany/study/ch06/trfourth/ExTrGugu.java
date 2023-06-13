package com.mycompany.study.ch06.trfourth;

import java.util.Scanner;	// Scanner 클래스 호출

public class ExTrGugu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
		
		TrGugu trGuGu = new TrGugu();
		
		while (trGuGu.z) {
			System.out.println("정수를 입력해 주세요");
			int scannerInt = scanner.nextInt(); // 입력받은 문자열을 str에 저장
			
			if (scannerInt != 0) {
				trGuGu.gugu(scannerInt);
			} else {
				System.out.println("프로그램 종료");
				trGuGu.z = false;
			}
		}

	}

}
