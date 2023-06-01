package com.mycompany.study.ch03;

public class ExLogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 논리 연산자
		// && = & : and : 논리곱 : 모두 참이여야 true (교집합)
		// || = | : or : 논리합 : 하나라도 참이면 true (합집합)
		// ^ : 배타적 논리합 : 연산값이 다르면 true, 동일하면 false (여집합)
		
		 int a = 65;
		 
		 if (a >= 65 && a <= 70) {
			 System.out.println("&& : true");
		 }
		 
		 if (a >= 65 & a <= 70) {
			 System.out.println(" & : true");
		 }
		 
		 if (a > 65 && a <= 70) {
			 System.out.println("&& : true");	// 출력되지 않음
		 }
		 
		 if (a > 65 || a <= 70) {
			 System.out.println("|| : true");
		 }
		 
		 if (a >= 65 ^ a <= 70) {
			 System.out.println(" ^ : true");	// 출력되지 않음
		 }

	}

}
