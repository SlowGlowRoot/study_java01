package com.mycompany.study.ch07.third;

import com.mycompany.study.ch07.first.CellPhone;

public class ExSmartPhone {

	public static void main(String[] args) {
		
		Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("smartphone");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		smartPhone.open();
		
		// 클래스가 public이기 때문에 import가 가능함. (private : 외부 사용 X, protected : 같은 패키지 or 자식 클래스 한정)
		CellPhone cellphone = new CellPhone();

	}

}
