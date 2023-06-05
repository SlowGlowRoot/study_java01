package com.mycompany.study.ch05;

public class ExArrayInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] score = {{99, 88, 55}, {55, 77, 66}, {55, 55, 44}, {55, 55, 44}, {55, 55, 77}};
		String[] scoreStudent = {"가영이", "나영이", "다영이", "아영이", "하영이"};
		String[] scoreSubject = {"국어", "영어", "수학"};
		
		System.out.println("3학년 1반의 학생 수는 " + scoreStudent.length + "명입니다.");
		System.out.println("----------------");
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.println(scoreStudent[i] + "의 " + scoreSubject[j] + " 점수는 " + score[i][j] + "점 입니다.");
			}
			System.out.println("----------------");
		}
		
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		
		for (int a = 0; a < score.length; a++) {
			sumKor = sumKor + score[a][0]; 
			sumEng = sumEng + score[a][1];
			sumMath = sumMath + score[a][2];
		}
		System.out.println("국어 평균 총합 : " + sumKor + "점");
		System.out.println("영어 평균 총합 : " + sumEng + "점");
		System.out.println("수학 평균 총합 : " + sumMath + "점");
		System.out.println("----------------");
		System.out.println("국어 평균 : " + sumKor / 5 + "점");
		System.out.println("영어 평균 : " + sumEng / 5 + "점");
		System.out.println("수학 평균 : " + sumMath / 5 + "점");
		System.out.println("----------------");
		
		
		int sumStudent1 = 0;
		int sumStudent2 = 0;
		int sumStudent3 = 0;
		int sumStudent4 = 0;
		int sumStudent5 = 0;
		for (int b = 0; b < 3; b++) {
			sumStudent1 = sumStudent1 + score[0][b];
			sumStudent2 = sumStudent2 + score[1][b];
			sumStudent3 = sumStudent3 + score[2][b];
			sumStudent4 = sumStudent4 + score[3][b];
			sumStudent5 = sumStudent5 + score[4][b];			
		}
		System.out.println(scoreStudent[0] + "의 국어, 영어, 수학의 점수 총합은 " + sumStudent1 + "입니다.");
		System.out.println("따라서 평균 점수는 " + sumStudent1 / 3 + "점 입니다.");
		System.out.println("----------------");
		System.out.println(scoreStudent[1] + "의 국어, 영어, 수학의 점수 총합은 " + sumStudent2 + "입니다.");
		System.out.println("따라서 평균 점수는 " + sumStudent2 / 3 + "점 입니다.");
		System.out.println("----------------");
		System.out.println(scoreStudent[2] + "의 국어, 영어, 수학의 점수 총합은 " + sumStudent3 + "입니다.");
		System.out.println("따라서 평균 점수는 " + sumStudent3 / 3 + "점 입니다.");
		System.out.println("----------------");
		System.out.println(scoreStudent[3] + "의 국어, 영어, 수학의 점수 총합은 " + sumStudent4 + "입니다.");
		System.out.println("따라서 평균 점수는 " + sumStudent4 / 3 + "점 입니다.");
		System.out.println("----------------");
		System.out.println(scoreStudent[4] + "의 국어, 영어, 수학의 점수 총합은 " + sumStudent5 + "입니다.");
		System.out.println("따라서 평균 점수는 " + sumStudent5 / 3 + "점 입니다.");
		System.out.println("----------------");
	}

}
