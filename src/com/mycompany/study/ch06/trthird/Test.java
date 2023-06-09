package com.mycompany.study.ch06.trthird;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrTest trtest = new TrTest();
		
		int plus = trtest.add(5, 2);
		int minus = trtest.add(5, 2);
		int multiple = trtest.add(5, 2);
		System.out.println("5 + 2 = " + plus);
		System.out.println("5 - 2 = " + minus);
		System.out.println("5 * 2 = " + plus);
		
		String iKnow = trtest.knowlegdeNy("아!루");
		String idk = trtest.knowlegdeNy("몰?루");
		String idkReally = trtest.knowlegdeNy("야 너 진짜 몰라?");
		System.out.println(iKnow);
		System.out.println(idk);
		System.out.println(idkReally);
		
		trtest.beauty("아이브");
		trtest.beauty("다른 사람은?");
		
		int takeMyMoney = trtest.taken();
		System.out.println("길에서 " + takeMyMoney + "원를 얻었습니다.");
				

	}

}
