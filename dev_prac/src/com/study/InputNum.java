package com.study;

import java.util.Scanner;

public class InputNum {

	public static void main(String[] args) {
		int num = 0, sum = 0; 
		System.out.println("입력 > ");
		
		Scanner scan = new Scanner(System.in);
		
		String tmp = scan.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num != 0) { // num이 0이 아닐때
			sum += num % 10;
			System.out.printf("sum = %3d num = %d%n", sum, num);
			
			num /= 10;
		}
		System.out.println(sum);
	}

}
