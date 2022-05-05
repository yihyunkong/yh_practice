package com.dice;

import java.util.Scanner;
import java.util.Random;
/////////////////////////////////////////////////// Random Dice 2 ///////////////////////////////////////////////////
//////////////////////// 게임 시작 묻기 - 기회 부여 - 숫자 입력 후 성공 여부 묻기 - 정답 공개하기 - 게임 종료 ////////////////////////
////////////////////////////////////////////////////// 코드 줄이기 ////////////////////////////////////////////////////

public class RandomDice3 {

	public static void main(String[] args) { // 메인 메소
		
		Random ran = new Random(); // 랜덤 함수 생성 
		Scanner scan = new Scanner(System.in); // 스캐너 함수 생성 
		
		System.out.println("==========Random Dice==========");
		System.out.println("게임을 시작하시겠습니까? 1.Yes 2.No");
		String yOrN = scan.nextLine();
		
			if(yOrN.equals("2")) {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("게임을 시작합니다.");
				System.out.println("0부터 9까지의 숫자를 입력하세요. 기회는 5번 입니다.");
				int count = 5; // 카운트를 while문 바깥에 두니 성공함 ! 왜지?
				int answer = ran.nextInt(10);
				System.out.println(answer);
				
				while(true) {
					if(yOrN.equals("1")) {
						int user = scan.nextInt();
						
						if(count == 1) {
							System.out.println("아쉽게도 실패했습니다.");
							System.out.println("정답은 " + answer + "(이)였습니다.");
						} else if(user < answer) {
							count--;
							System.out.print("더 높은 숫자입니다.");
							System.out.println(" 기회는 " + count + "번 남았습니다.");
						} else if(user > answer) {
							count--;
							System.out.print("더 낮은 숫자입니다.");
							System.out.println(" 기회는 " + count + "번 남았습니다.");
						} else if(user == answer) {
							System.out.println("축하합니다. 정답입니다.");
							break;
						}
					} 
				}
			}
	}			

}