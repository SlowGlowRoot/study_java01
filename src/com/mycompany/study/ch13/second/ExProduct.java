package com.mycompany.study.ch13.second;

public class ExProduct {

	public static void main(String[] args) {
	
		Product<String, Integer> product = new Product<>();
		
		product.setKind("Tony");
		product.setModel(100);
		
		System.out.println(product.getKind());
		System.out.println(product.getModel());
		
		// 여기에서 Tv는 선언만 한 것뿐이지, Tv타입을 실제로 사용하는 것은 아님.
		Product<Tv, String> product2 = new Product<>();
		
		// 그렇기 떄문에 Tv
		객체를 만들어야 함.
		Tv tv = new Tv();
		
		product2.setKind(tv);
		product2.setModel("LOL");
		
		System.out.println(product2.getKind());
		System.out.println(product2.getModel());
		
	}

}
