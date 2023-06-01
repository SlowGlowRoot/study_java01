package com.mycompany.study.ch04;

public class ExIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if - 학점 계산
		
		int score = 40;
		
		if (score >= 90) {
			if (score >= 97) {
				System.out.println("grade : A+");
			} else if (score >= 93) {
				System.out.println("grade : A");
			} else {
				System.out.println("grade : A-");
			}
		} else if (score >= 80) {
			if (score >= 87) {
				System.out.println("grade : B+");
			} else if (score >= 83) {
				System.out.println("grade : B");
			} else {
				System.out.println("grade : B-");
			}
		} else if (score >= 70) {
			if (score >= 77) {
				System.out.println("grade : C+");
			} else if (score >= 73) {
				System.out.println("grade : C");
			} else {
				System.out.println("grade : C-");
			}
		} else if (score >= 60) {
			if (score >= 67) {
				System.out.println("grade : D+");
			} else if (score >= 63) {
				System.out.println("grade : D");
			} else {
				System.out.println("grade : D-");
			}
		} else {
			System.out.println("grade : F, 오늘 강의 끝나고 교수실 들리길 요망.");
		}
		
		
		
	}

}
