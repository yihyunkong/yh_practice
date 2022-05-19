package com.practice;

import java.util.Scanner;

public class Alarm {
	Scanner scan = new Scanner(System.in);
	int hour, minute;
	int minus;
	
	public Alarm() {
		wake();
	}
	
	void wake() {
		System.out.println("알람을 설정하세요. \n");
		
		while(true) {
			System.out.print("H : ");
			hour = scan.nextInt();
		
			if(0 > hour || hour > 24) {
				System.out.println("다시 입력해주세요. \n");
				continue;
			} else {
				while(true) {
					System.out.print("M : ");
					minute = (scan.nextInt());
					
					if(0 > minute || minute > 59) {
						System.out.println("다시 입력해주세요. \n");
						continue;
					}
					System.out.println("일어날 시간은 " + hour + "시 " + minute + "분 입니다.");
					break;
				}
			}
			break;
		}
		
	}
	public static void main(String[] args) {
		new Alarm();
	}

}
