package com.mycompany.study.ch03;

public class ExIncreaseDecreaseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 증감 연산자 (++, --)
		
		int i = 0;
		int j = 0;
		
		++i;
		j++;
		
		System.out.println("i : " + i);
		System.out.println("j : " + j);	
		System.out.println("------------------------------");
		
		
		
		int k = i++;	// i에 k를 대입한 뒤, i를 1 증가
		int m = ++j;	// j를 1 증가시킨 뒤, m에 j를 증가
		
		System.out.println("k : " + k);		// 1
		System.out.println("i : " + i);		// 2
		System.out.println("m : " + m);		// 2
		System.out.println("j : " + j);		// 2
		System.out.println("------------------------------");
		
		
		
		--i;
		int z = ++i + j++;
		
		System.out.println("z : " + z);
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		
		
		
		/*
		 * int a = 1; int b = 1;
		 * 
		 * --a; b--;
		 * 
		 * System.out.println("a : " + a); System.out.println("b : " + b);
		 */
		
	}

}
