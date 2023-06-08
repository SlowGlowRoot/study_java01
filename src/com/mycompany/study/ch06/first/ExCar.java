package com.mycompany.study.ch06.first;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		System.out.println(a);
		
		Car car = new Car();	// 생성 (=기본생성자)
		
		// 이하 사용
		System.out.println("car.company : " + car.company);
		System.out.println("car.name : " + car.name);
		System.out.println("car.color : " + car.color);
		System.out.println("car.engine : " + car.engine);
		System.out.println(car);
		
		car.go();
		car.back();

// 		클래스 클래스변수 = new연산자 생성자();	-- 1. 클래스와 생성자의 이름은 동일해야함.
		Mp3 mp3 = new Mp3();
		
		System.out.println("mp3.company : " + mp3.company);
		System.out.println("mp3.size : " + mp3.size);
		System.out.println("mp3.name : " + mp3.name);
		System.out.println("mp3.price : " + mp3.price);
		System.out.println("mp3.isEarPhone : " + mp3.isEarPhone);
		System.out.println("mp3.isEasyToCarry : " + mp3.isEasyToCarry);
		
		mp3.volUp();
		mp3.volDown();
		mp3.play();
		mp3.pause();
		mp3.stop();
		mp3.next();
		mp3.prev();
		
	}

}
