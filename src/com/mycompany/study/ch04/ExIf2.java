package com.mycompany.study.ch04;

public class ExIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade = 1;
		int cost = 12000;
		int originalCost = 12000;
		
//		String grade1 = "일반";
//		String grade2 = "브론즈";
//		String grade3 = "실버";
//		String grade4 = "골드";
//		String grade5 = "플래티넘";
		
		if (grade == 1) {
			cost *= 0.95;
			int cost1 = (int) cost;
			System.out.println("정가가 " + originalCost + "원인 일반 등급의 할인가는 : " + cost1 + "원입니다." );
		} else if (grade == 2) {
			cost *= 0.90;
			int cost2 = (int) cost;
			System.out.println("정가가 " + originalCost + "원인 브론즈 등급의 할인가는 : " + cost2 + "원입니다." );
		} else if (grade == 3) {
			cost *= 0.85;
			int cost3 = (int) cost;
			System.out.println("정가가 " + originalCost + "원인 실버 등급의 할인가는 : " + cost3 + "원입니다." );
		} else if (grade == 4) {
			cost *= 0.80;
			int cost4 = (int) cost;
			System.out.println("정가가 " + originalCost + "원인 골드 등급의 할인가는 : " + cost4 + "원입니다." );
		} else if (grade == 5) {
			cost *= 0.973;
			int cost5 = (int) cost;
			System.out.println("정가가 " + originalCost + "원인 플래티넘 등급의 할인가는 : " + cost5 + "원입니다." );
		} else {
			System.out.println("grade값은 1 ~ 5 사이의 정수 값만 가능합니다.");
		}
	}

}

// 
