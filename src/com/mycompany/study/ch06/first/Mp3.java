package com.mycompany.study.ch06.first;

public class Mp3 {

	String company = "Apple Co.";
	String name = "Ipod 7세대";
	String price = "328,000원";
	int size = 64;
	boolean isEarPhone = true;
	boolean isEasyToCarry = true;
	
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
