package com.mycompany.study.ch02;

public class test_230525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean booleanVar01 = true;
		boolean booleanVar02 = false;
		
		if (booleanVar01) {
			System.out.println("기본값입니다.");
		} else {
			System.out.println("여분값입니다.");
		}
		
		 byte byteVar01 = -128;
		 byte byteVar02 = 127;
		 System.out.println("byte값의 최소, 최댓값은 " + byteVar01 + " ~ " + byteVar02 + "이다.");
		 
		 
		 char charVar01 = 'A';
		 char charVar02 = 65;
		 char charVar03 = '\u0041';
		 System.out.println("'A'은 문자로 " + charVar01 + ", '65'는 10진수로 " + charVar02 + ", '\u0041'는 16진수(유니코드, 아스키코드)로 " + charVar01 + "를 뜻한다.");
		 
		 double doubleVar01 = 3;
		 double doubleVar02 = 3.0;
		 System.out.println("double에서 3과 3.0은 " + doubleVar01 + ", " + doubleVar02 + "으로 똑같이 3.0으로 표기된다.");
		 
		 float floatVar01 = 1234567;
		 float floatVar02 = 12345678;
		 System.out.println("float에서 7자리까지는 " + floatVar01 + ", 8자리 이상부터는 " + floatVar02 + "과 같이 표기된다.");
		 
		 float floatVar03 = 3.1415926535897932384626433832795028f;
		 System.out.println("또, float을 사용하여 소수를 표현할 때는 끝에 f나 F를 꼭 붙여 써야한다. : " + floatVar03);
		 
		 int intVar01 = 10;
		 int intVar02 = 012;
		 int intVar03 = 0xa;
		 System.out.println("'10'은 10진수로 " + intVar01 + ", '012'는 8진수로 " + intVar02 + ", '0xa'는 16진수로 " + intVar03 + "를 뜻한다.");
		 
		 long longVar01 = -2147483648;
		 long longVar02 = 2147483647;
		 long longVar03 = 2147483648L;
		 System.out.println("long은 " + longVar01 + " ~ " + longVar02 + "까지는 그냥 써도 되지만 그 이상부터는 (ex : " + longVar03 + ") 뒤에 l이나 L을 꼭 붙여 써야한다.");
		 
		 System.out.println("Promotion의 순서는 byte > short > int > long > float > double 순이다.");
		 
		 byte var01 = 10;
		 System.out.println("10 -> " + var01 + " (byte값)");
		 byte var02 = var01;
		 System.out.println("10 (var01, byte값) -> " + var02 + " (short값)");
		 byte var03 = var02;
		 System.out.println("10 (var02, short값) -> " + var03 + " (int값)");
		 byte var04 = var03;
		 System.out.println("10 (var03, int값) -> " + var04 + " (long값)");
		 byte var05 = var04;
		 System.out.println("10 (var04, long값) -> " + var05 + " (float값)");
		 byte var06 = var05;
		 System.out.println("10 (var05, float값) -> " + var06 + " (double값)");
		 
	}
}
