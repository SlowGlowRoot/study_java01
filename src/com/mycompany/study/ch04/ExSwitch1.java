package com.mycompany.study.ch04;

public class ExSwitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 3;
		
		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		default:
			System.out.println("1번도 2번도 아닌 것이 나왔습니다.");
			break;
		}
		
		String position = "사장";
		
		switch (position) {
		case "사장":
			System.out.println("사장의 연봉은 300억입니다.");
			break;
		case "부장":
			System.out.println("부장의 연봉은 5억입니다.");
			break;
		case "과장":
			System.out.println("과장의 연봉은 1억 5천입니다.");
			break;
		case "대리":
			System.out.println("대리의 연봉은 9천 2백입니다.");
			break;
		case "주임":
			System.out.println("주임의 연봉은 6천 5백입니다.");
			break;
		case "사원":
			System.out.println("사장의 연봉은 4천 백입니다.");
			break;
		case "나":
			System.out.println("내 연봉은 3000자입니다.");
			break;
		default:
			System.out.println("...누, 누구세요?");
			break;
		}

	}

}
