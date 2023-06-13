package com.mycompany.study.ch07.third;

public abstract class Phone {

	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("turnOn");
	}
	
	public void turnOff() {
		System.out.println("turnOff");
	}
	
	// abstract는 중괄호가 없음.	
	public abstract void open();
	
}
