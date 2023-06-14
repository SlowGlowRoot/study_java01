package com.mycompany.study.ch07.ttest05;

public class Computer extends Calculator {
	
	@Override
	public double param(int a) {
		Constants constants = new Constants();
		double b = constants.PAI_2 * a * a;
		return b;
	}

}
