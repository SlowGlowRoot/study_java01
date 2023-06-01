package com.mycompany.study.ch04;

public class ExIf4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		int y = 0;
		
		if (x > 0 && y > 0) {
			System.out.println("점 (" + x +", " + y + ")은(는) 1사분면에 위치합니다.");
		} else if (x < 0 && y > 0) {
			System.out.println("점 (" + x +", " + y + ")은(는) 2사분면에 위치합니다.");
		} else if (x < 0 && y < 0) {
			System.out.println("점 (" + x +", " + y + ")은(는) 3사분면에 위치합니다.");
		} else if (x > 0 && y < 0) {
			System.out.println("점 (" + x +", " + y + ")은(는) 4사분면에 위치합니다.");
		} else if (x == 0 && y != 0){
			System.out.println("점 (" + x +", " + y + ")은(는) y축에 위치합니다.");
		} else if (x != 0 && y == 0){
			System.out.println("점 (" + x +", " + y + ")은(는) x축에 위치합니다.");
		} else {	// x == 0 && y == 0
			System.out.println("점 (" + x +", " + y + ")은(는) 원점에 위치합니다.");
		}

	}

}
