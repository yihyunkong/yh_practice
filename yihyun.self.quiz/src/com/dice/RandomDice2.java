package com.dice;

import java.util.Scanner;
import java.util.Random;
/////////////////////////////////////////////////// Random Dice 2 ///////////////////////////////////////////////////
////////////////////////////// 게임 시작 묻기 - 기회 부여 - 숫자 입력 후 성공 여부 묻기 - 게임 종료 ///////////////////////////////
////////////////////////////////// String 타입로 선언하여 int 타입으로 변환시키기, 코드 줄이기 //////////////////////////////////
public class RandomDice2 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int answer = ran.nextInt(10);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==========Random Dice==========");
		System.out.println("게임을 시작하시겠습니까? 1.Yes 2.No");
		String str = null;
		
		while((str=scan.next()) !=null) {
			if(str.equals("1")) {
				System.out.println("게임을 시작합니다.");
				break;
			} else if(str.equals("2")) {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}
		}
		
		System.out.println("0부터 9까지의 숫자를 입력하세요. 기회는 5번 입니다.");
		int input = scan.nextInt();
		int count = 5;
		
		while(true) {
				if(count == 1) {
					System.out.println("아쉽게도 실패했습니다.");
					break;
				} else if(input < answer) {
					count--;
					System.out.print("더 높은 숫자입니다.");
					System.out.println(" 기회는 " + count + "번 남았습니다.");
					input = scan.nextInt();
				} else if(input > answer) {
					count--;
					System.out.print("더 낮은 숫자입니다.");
					System.out.println(" 기회는 " + count + "번 남았습니다.");
					input = scan.nextInt();
				} else if(input == answer) {
					System.out.println("축하합니다. 정답입니다.");
					break;
				}
		} 
	}
}