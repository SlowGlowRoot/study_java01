package com.mycompany.study.ch13.second;

public class Product<T, M> {

//	Generic 타입 param 복수선언
	
	private T kind;
	private M model;
	
//	우클릭 -> Source -> Generate Getters and Setters -> 체크박스 클릭
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}
