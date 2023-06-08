package com.mycompany.study.ch06.trfirst;

public class TrExCar {
	
	public static void main(String[] args) {
		
		TrCar car = new TrCar();
		
		System.out.println("car.company : " + car.company);
		System.out.println("car.name : " + car.name);
		System.out.println("car.color : " + car.color);
		System.out.println("car.engine : " + car.engine);
		
		car.goStraight();
		car.goBack();
		car.speedUp();
		car.speedDown();
		
	}

}
