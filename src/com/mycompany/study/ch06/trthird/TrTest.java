package com.mycompany.study.ch06.trthird;

public class TrTest {

	public int add(int a, int b) {
		int y = a + b;
		return y;
	}
	
	public int sub(int a, int b) {
		int y = a - b;
		return y;
	}
	
	public int mul(int a, int b) {
		int y = a * b;
		return y;
	}
	
	public String knowlegdeNy(String say) {
		if (say == "몰?루") {
			System.out.print("아!루");
		} else if (say == "아!루") {
			System.out.print("몰?루");
		} else {
			System.out.print("저 진짜 몰라요ㅠㅠ");
		}
		return "";
	}
	
	public void beauty(String name) {
		switch (name) {
		case "아이브":
			System.out.println("장원영은 너무 예뻐");
			break;
		default:
			System.out.println("다른 사람들도 다 예뻐");
			break;
		}
	}
	
	public int taken() {
		return 10000;
	}
	
}
