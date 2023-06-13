package com.mycompany.study.ch06.trfourth;

public class TrGugu {
	
	boolean z = true;
	public void gugu (int num) {
		System.out.println("입력하신 정수는: " + num);
		
		for(int i=1; i<=9; i++) {
			System.out.println(num + " * " + i+ " = " + num * i);
		}	
		System.out.println("==============");
	}
	
}
