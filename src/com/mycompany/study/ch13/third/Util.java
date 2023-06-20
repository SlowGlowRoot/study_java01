package com.mycompany.study.ch13.third;

public class Util {

	// public Box boxing (String a) {
	public static <T> Box<T> boxing(T t) {	// 위 함수를 General 타입으로 변환
		Box<T> box = new Box<>();
		return box;
	}
}
