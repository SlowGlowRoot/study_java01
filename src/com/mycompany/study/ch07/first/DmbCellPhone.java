package com.mycompany.study.ch07.first;

public class DmbCellPhone extends CellPhone {

	// child class
	
	// 필드
	int channel;
	
	// 메소드
	void turnOnDmb() {
		powerOn();
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}	
	
	// 부모클래스의 메소드를 재정의 하는 것, 메소드명, 변수명, 리턴값이 동일해야 함.
	@Override
	void powerOff() {
		System.out.println("dmb.powerOff() 입니다.");
	}
	
	@Override
	void powerOn() {
		System.out.println("dmb.powerOn() 입니다.");
	}
	
	@Override
	void powerOn(int a) {
		System.out.println("dmb.powerOn(int a) 입니다.");
	}
}
