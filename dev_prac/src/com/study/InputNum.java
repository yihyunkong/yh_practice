package com.study;

import java.util.Scanner;

public class InputNum {

	public static void main(String[] args) {
		int num = 0, sum = 0; 
		System.out.println("�Է� > ");
		
		Scanner scan = new Scanner(System.in);
		
		String tmp = scan.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num != 0) { // num�� 0�� �ƴҶ�
			sum += num % 10;
			System.out.printf("sum = %3d num = %d%n", sum, num);
			
			num /= 10;
		}
		System.out.println(sum);
	}

}
