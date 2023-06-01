package com.mycompany.study.ch03;

public class ExConditionalOperator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 삼향 연산자 (조건식) ? A : B
		
		int math = 90;
		char grade = (math >= 90) ? 'A' : 'B';
		
/*		if (math >= 90) {
			grade = 'A';
		} else {
			grade = 'B';
		}
*/
		
		System.out.println("grade : " + grade);
		
	}
	
}
