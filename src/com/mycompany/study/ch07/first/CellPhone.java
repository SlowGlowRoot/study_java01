package com.mycompany.study.ch07.first;

public class CellPhone {
	
	// parent class
	
	// 필드
	String model;
	String color;
	
	// 생성자
	
	// 메소드
	void powerOn() { System.out.println("전1원을 킵니다."); }
	void powerOff() { System.out.println("전원을 끕니다"); }
	void Bell() { System.out.println("벨이 울립니다."); }
	void sendVoice() { System.out.println("당신 : " + message); }
	void receiveVoice() { System.out.println("상대방 : " + message); }
	void hangUp() { System.out.println("전화를 끊습니다."); }
	
	// overload(오버로드), 메소드명이 같더라도 parameter의 개수, 타입이 다르면 가능함.
	void powerOn(int a) { System.out.println("전2원을 킵니다."); }

}
