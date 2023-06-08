package com.mycompany.study.ch06.trsecond;

public class TrExMp3 {

	public static void main(String[] args) {

		TrMp3 mp1 = new TrMp3();
		TrMp3 mp2 = new TrMp3("Workman");
		TrMp3 mp3 = new TrMp3(128, "Ipod", "Apple Co.", true, true);
		
		System.out.println("mp1.name : " + mp1.name);
		System.out.println("mp1.storage : " + mp1.storage);
		System.out.println("=========================");
		
		System.out.println("mp2.name : " + mp2.name);
		System.out.println("mp2.storage : " + mp2.storage);
		System.out.println("=========================");
		
		System.out.println("mp3.company : " + mp3.company);
		System.out.println("mp3.name : " + mp3.name);
		System.out.println("mp3.storage : " + mp3.storage);
		System.out.println("mp3.isEarPhone : " + mp3.isEarPhone);
		System.out.println("mp3.isEasyToCarry : " + mp3.isEasyToCarry);
		System.out.println("=========================");
		
		mp3.volUp();
		mp3.volDown();
		mp3.play();
		mp3.pause();
		mp3.prev();
		mp3.next();
		mp3.stop();

	}

}
