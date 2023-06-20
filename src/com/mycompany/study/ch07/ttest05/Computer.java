package com.mycompany.study.ch07.ttest05;

public class Computer extends Calculator {
	
	@Override
	public double param(double r) {
		return Constants.PAI_2 * r * r;
	}

}
