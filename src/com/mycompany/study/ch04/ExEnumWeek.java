package com.mycompany.study.ch04;

public class ExEnumWeek {
	
	public static void main(String[] args) {
		
							// DataType과 int형, EnumType과 Week의 관계가 동일함.
		int a = 1;
		String abc;
//		abc = Week.MONDAY;	// err: Type Mismatch
		abc = Week.MONDAY.toString();	// .toString()을 뒤에 붙여주면 Monday를 강제로 String형으로 변환한다. -> "MONDAY"
		System.out.println(abc);
		
		Week week;
		week = Week.MONDAY;
		System.out.println(week);
		
	}

}
