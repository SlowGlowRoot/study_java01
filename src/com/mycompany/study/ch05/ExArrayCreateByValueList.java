package com.mycompany.study.ch05;

public class ExArrayCreateByValueList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] scoreEnglish;
//		int scoreMath[];
//		
//		String[] name;
//		String name2[];
//		
//		double[] total;
//		double avg[];
//		
//		char[] grade;
//		char grade2[];
//		
//		boolean[] score;
//		boolean score2[];
		
		int[] scoreChemistry = {100, 99, 98, 97, 96, 95, 94};
		String[] scoreStudent = {"신", "경원", "하언", "현수", "선우"};
		char[] scoreGrade = {'A', 'B', 'C', 'D', 'F'};
		
//		scoreChemistry[7] = 93;		컴파일 안됨(오류), 한 번 선언된 배열은 그 크기를 늘릴 수 없음.
		
//		int[] scoreAAA;
//		scoreAAA = {100, 99, 98, 97, 96};		실행 안됨(오류), 배열은 선언과 초기화를 동시에 해주어야함
		
		int a = scoreChemistry.length;
		System.out.println("배열 scoreChemistry의 길이는 : " + a);
		System.out.println("");
		
		
		
		System.out.println("For문으로 Array 출력");
		for (int i = 0; i <= 6; i++) {
			System.out.print(scoreChemistry[i]);
			if (i == 6) {
				System.out.println("");
				break;
			} else {
				System.out.print(", ");
			}
		}
		System.out.println("");
		
		
		
		System.out.println("향상된 For문으로 Array의 합 출력");
		int sum = 0;
		for (int bb: scoreChemistry) {
			sum = sum + bb;
			System.out.println("현재까지 점수 합산 : " + sum);
		}
		System.out.println("sum = " + sum);
		System.out.println("");

		
		
		System.out.println("Switch문으로 Array 출력");
		int i = 0;
		while (i <= scoreChemistry.length) {
			System.out.println(scoreChemistry[i]);
			i++;
		}

	}

}
