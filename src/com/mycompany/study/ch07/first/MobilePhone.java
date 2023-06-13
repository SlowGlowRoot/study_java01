package com.mycompany.study.ch07.first;

public class MobilePhone extends DmbCellPhone {

	void aaa() {
		System.out.println("asdfasdf");
		powerOn();
		changeChannelDmb(1);
	}
	
	@Override
	void changeChannelDmb(int channel) {
		System.out.println("MobilePhone.changeChannelDmb");
	}
	
	// Override 된 메소드를 다시 Override 할 수 있음.
	
	@Override
	void powerOff() {
		super.powerOff();
	}
	
	@Override
	void powerOn() {
		System.out.println("dmb.powerOn() 입니다.");
	}
	
	@Override
	void powerOn(int a) {
	}
	
}
