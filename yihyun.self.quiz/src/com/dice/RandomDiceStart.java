package com.dice;

import java.util.Scanner;
import java.util.Random;

public class RandomDiceStart {

	public static void main(String[] args) { // 메인 메소드 
		RandomDiceAnswer as = new RandomDiceAnswer();

		Scanner scan = new Scanner(System.in); // 스캐너 함수 생성 
		
		System.out.println("========== Random Dice ==========");
		System.out.println("게임을 시작하시겠습니까? 1.Yes 2.No");
		
		while(true) {
			String yOrN = scan.nextLine(); 
			
			if(yOrN.equals("2")) {
				System.out.println("게임을 종료합니다.");
				break;
				// 게임을 다시 권유하는 코드 추가하고 싶음.
			} else if(yOrN.equals("1")) {
				System.out.println("게임을 시작합니다.");
				System.out.println("0부터 9까지의 숫자를 입력하세요. 기회는 5번 입니다.");
				// 여기에 gameStart 메소드 추가
				as.gameStart(); // 게임 시작 메소드 
			} else {
				System.out.println("잘못된 숫자입니다. 다시 입력해주세요! 1.Yes 2.No"); // 다시 앞으로 돌아가야하는데,,, 모르겠음.. 그래서 배우지 않은 continue를 사용해봄 
				continue;
			}
			System.out.println("다시 시작하시겠습니까? 1.Yes 2.No");
		}	
	}			

}