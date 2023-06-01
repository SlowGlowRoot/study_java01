package com.mycompany.study.ch04;

public class ExIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 학점 계산, 2. 회원별 할인, 3. 홀/짝수 판별기
		
		
		// 1
		System.out.println("");
		System.out.println("// 1");
		System.out.println("");
		
		int score = 81;
		
		if (score >= 90) {
			if (score >= 97) {
				System.out.println("  당신의 학점은 : A+");
			} else if (score >= 93) {
				System.out.println("  당신의 학점은 : A");
			} else {
				System.out.println("  당신의 학점은 : A-");
			}
		} else if (score >= 80) {
			if (score >= 87) {
				System.out.println("  당신의 학점은 : B+");
			} else if (score >= 83) {
				System.out.println("  당신의 학점은 : B");
			} else {
				System.out.println("  당신의 학점은 : B-");
			}
		} else if (score >= 70) {
			if (score >= 77) {
				System.out.println("  당신의 학점은 : C+");
			} else if (score >= 73) {
				System.out.println("  당신의 학점은 : C");
			} else {
				System.out.println("  당신의 학점은 : C-");
			}
		} else if (score >= 60) {
			if (score >= 67) {
				System.out.println("  당신의 학점은 : D+");
			} else if (score >= 63) {
				System.out.println("  당신의 학점은 : D");
			} else {
				System.out.println("  당신의 학점은 : D-");
			}
		} else {
			System.out.println("  당신의 학점은 : F");
		}
		
		System.out.println("");
		System.out.println("-----------------------");
		System.out.println("");
		
		// 2
		
		System.out.println("// 2");
		System.out.println("");
		
		int memberGrade = 3;
		int price = 12000;
		int Originalprice = 12000;
		
		if (memberGrade == 1) {
			price *= 0.95;
			int salePriceCommon = price;
			System.out.println("  정가가 " + Originalprice + "원인 일반 회원의 할인가는 " + salePriceCommon + "원입니다.");
		} else if (memberGrade == 2) {
			price *= 0.90;
			int salePriceBronze = price;
			System.out.println("  정가가 " + Originalprice + "원인 브론즈 회원의 할인가는 " + salePriceBronze + "원입니다.");
		} else if (memberGrade == 3) {
			price *= 0.85;
			int salePriceSilver = price;
			System.out.println("  정가가 " + Originalprice + "원인 실버 회원의 할인가는 " + salePriceSilver + "원입니다.");
		} else if (memberGrade == 4) {
			price *= 0.80;
			int salePriceGold = price;
			System.out.println("  정가가 " + Originalprice + "원인 골드 회원의 할인가는 " + salePriceGold + "원입니다.");
		} else if (memberGrade == 5) {
			price *= 0.73;
			int salePricePlatinium = price;
			System.out.println("  정가가 " + Originalprice + "원인 플래티넘 회원의 할인가는 " + salePricePlatinium + "원입니다.");
		} else {
			System.out.println("  1~5 사이의 정수를 입력해주세요.");
		}
		
		System.out.println("");
		System.out.println("-----------------------");
		System.out.println("");
		
		// 3
		
		System.out.println("// 3");
		System.out.println("");

		int number = 0;
		
		if (number >= 0) {
			if (number % 2 == 1) {
				System.out.println("  입력하신 숫자 " + number + "은 홀수입니다.");
			} else if (number == 0) {
				System.out.println("  0은 홀수도 짝수도 아닙니다.");
			} else {
				System.out.println("  입력하신 숫자 " + number + "은 짝수입니다.");
			}
		} else {
			System.out.println("  양의 정수를 입력하여 주세요.");
		}
		
	}

}
