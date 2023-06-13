package com.mycompany.study.ch07.third;

public class SmartPhone extends Phone {
	
	public SmartPhone(String owner) {
		super(owner);
	}

	public void internetSearch() {
		System.out.println("Internet Search");
	}
	
	@Override
	public void open() {
		System.out.println("open()");
	}

}
