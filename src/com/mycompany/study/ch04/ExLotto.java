package com.mycompany.study.ch04;

import java.util.Scanner;

public class ExLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lotto = new int[6];
		int lottoTakeNum;
		
		Scanner sc = new Scanner(System.in);    // 인스턴스 생성
        System.out.print("로또뽑기 횟수 입력 : ");
        lottoTakeNum = sc.nextInt();
        
        for (int h = 1; h <= lottoTakeNum; h++) {
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int)((Math.random() * 45) + 1);
				for (int j = 0; j < i; j++) {
					// 오름차순 정리
					if (lotto[i] < lotto[j]) {
						int lottoAscend;
						lottoAscend = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = lottoAscend;
					}
					// 중복 숫자 X
					if (lotto[i] == lotto[j]) {
						i-- ;
					}
					for (int k = 0; k < j; k++) {
						// 연속된 세 자리 수 X
						if (lotto[k] + 1 == lotto[j] && lotto[j] == lotto[i] - 1) {
							i-- ;
						}
					}
				}
			}
			
			System.out.print("추첨된 로또 번호는 : ");
			for (int a = 0; a < lotto.length; a++) {
				if (a == 5) {
					System.out.println(lotto[a] + " 입니다.");
				} else {
					System.out.print(lotto[a] + ", ");
				}
			}
        }
	}

}
