package com.mycompany.study.ch05;

public class ExArrayCreateByNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = new int[3];
//		arr1 = {100, 99, 98};	-> err
		arr1[0] = 100;
		arr1[1] = 99;
		arr1[2] = 98;
		System.out.println("arr1.length : " + arr1.length);
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		for (int i: arr1) {
			System.out.println(i);
		}
		
		// 이미 arr2라는 배열에 대한 칸을 선언해두고, 그 빈칸을 채우는 것이기 때문에 오류가 나지 않는다.
		int[] arr2;
		arr2 = new int[5];

	}

}
