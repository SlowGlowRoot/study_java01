package com.mycompany.study.ch03;

public class ExStringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열 관련
		
		String str1 = "장원영";	// 주소값
		String str2 = "장원영";	// 주소값 (str1과 동일한 리터럴 주소값)
		String str3 = new String("장원영"); 	// 원시데이터
		
		boolean result1 = (str1 == str2); 
		System.out.println("result1 = " + result1);	// true
		
		boolean result2 = (str1 == str3);	// 메모리 자체를 비교
		System.out.println("result2 = " + result2);	// false
		
		System.out.println(str1.equals(str2));	// equals method : 주소값에 직접 찾아가서 실제값을 비교
		System.out.println(str1.equals(str3));
	}

}
