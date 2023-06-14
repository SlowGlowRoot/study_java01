package com.mycompany.study.ch08.second;

public class ImplementationC implements InterfaceC {
	
	// InterfaceC는 InterfaceA와 InterfaceB를 상속 받고 있으므로 methodA와 methodB도 자동으로 override된다.
	@Override
	public void methodA() {
		System.out.println("ImplementationC_methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC_methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC_methodC() 실행");
	}

}
