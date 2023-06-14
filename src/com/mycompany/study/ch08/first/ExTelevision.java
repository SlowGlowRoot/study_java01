package com.mycompany.study.ch08.first;

public class ExTelevision {

	public static void main(String[] args) {

//		RemoteControl remoteControl = new RemoteControl(); (X)
		// 불가능, 인터페이스는 객체화 시킬 수 없다, 다른 클래스 등에 붙여서 사용해야 함.
		
//		Television television = new Television();
//			// 얘는 일반 객체(클래스)이므로 호출(카카뉴카)해서 사용 가능
//		television.turnOn();
//		television.setMute(true);
			// 이 방식은 구동은 되지만 정삭적으로 인터페이스를 사용한 것이 아니다.
		
		
		RemoteControl.changeBattery();
		// static은 호출(카카뉴카) 상관없이 직접적으로 사용할 수 있다.
		
		RemoteControl remoteControl = new Television();
		remoteControl.turnOn();
		remoteControl.setMute(true);
	}

}
