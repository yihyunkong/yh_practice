package com.practice;

import java.util.Scanner;

public class LeapYear {
	Scanner scan = new Scanner(System.in);
	int userInput = scan.nextInt();
	int year;
	
	public LeapYear() { // 메인 메소드
		leapYearEnter();
	}
	
	void leapYearEnter() {
		year = userInput;
		if(0 <= year || year <= 4000) {
			if((year%100 == 0) && (year%4 == 0)) {
				System.out.println("윤년입니다.");
			} else {
				System.out.println("윤년이 아닙니다.");
			}
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("연도를 입력하세요.");
		new LeapYear();
	}

}
