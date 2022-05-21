package com.practice;

import java.util.Scanner;

public class Compare {
	Scanner scan = new Scanner(System.in);
	int A;
	int B;
	int userInput;
	
	public Compare() {
		AB();
	}
	
	void AB() {
		while(true) {
			System.out.println("A 숫자를 입력하세요.");
			userInput = scan.nextInt();
			A = userInput;
			System.out.println("B 숫자를 입력하세요.");
			userInput = scan.nextInt();
			B = userInput;
			
			if((-10000 > A || A > 10000) || (-10000 > B || B > 10000)) {
				System.out.println("범위가 틀렸습니다. 다시 입력해주세요.");
				continue;
			} else if(A > B) {
				System.out.println("A");
			} else if(A < B) {
				System.out.println("B");
			}
			break;
		}
		
	}
	public static void main(String[] args) {
		new Compare();
	}

}
