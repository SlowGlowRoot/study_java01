package com.mycompany.study.ch06.trsecond;

public class TrMp3 {

	int storage;
	String name;
	String company;
	boolean isEarPhone;
	boolean isEasyToCarry;
	
	TrMp3() {
		
	}
	
	TrMp3(String name) {
		
	}
	
	TrMp3(int storage, String name, String company, boolean isEarPhone, boolean isEasyToCarry) {
		this.storage = storage;
		this.name = name;
		this.company = company;
		this.isEarPhone = isEarPhone;
		this.isEasyToCarry = isEasyToCarry;
	}
	
	void volUp() {
		System.out.println("음량을 올립니다.");
	}
	
	void volDown() {
		System.out.println("음량을 내립니다.");
	}
	
	void play() {
		System.out.println("음악을 재생합니다.");
	}
	
	void pause() {
		System.out.println("음악을 일시 중지합니다.");
	}
	
	void next() {
		System.out.println("다음 음악을 재생합니다.");
	}
	
	void prev() {
		System.out.println("이전 음악을 재생합니다.");
	}
	
	void stop() {
		System.out.println("음악 재생을 종료합니다.");
	}
	
}
