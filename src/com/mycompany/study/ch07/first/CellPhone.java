package com.mycompany.study.ch07.first;

public class CellPhone {
	
	// parent class
	
	// 필드
	String model;
	String color;
	
	// 생성자
	
	// 메소드
	void powerOn() { System.out.println("전원을 킵니다."); };
	void powerOff() { System.out.println("전원을 끕니다"); };
	void Bell() { System.out.println("벨이 울립니다."); };
	void sendVoice() { System.out.println("목소리를 보냅니다."); };
	void receiveVoice() { System.out.println("목소리를 받습니다."); };
	void HangUp() { System.out.println("전화를 끊습니다."); };

}
