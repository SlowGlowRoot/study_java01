package com.mycompany.study.ch10.first;

public class ExTryCatchFinally {
	
	public static void main(String[] args) {
		
//		Class clazz = Class.forName("Entry");
		
		try {
			Class clazz = Class.forName("Entry");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 없습니다. 다른 클래스로 진행해 주십시오.");
		}
		
	}

}
