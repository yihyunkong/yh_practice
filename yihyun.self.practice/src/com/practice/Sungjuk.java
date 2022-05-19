package com.practice;

import java.util.Scanner;

public class Sungjuk {
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;
		int total, avg;
		int sub;
		
		
		public Sungjuk() {
			enterSungjuk(3);
		}
		
		void enterSungjuk(int sub) {
			System.out.print("국어 성적을 입력하세요. \n> ");
			kor = scan.nextInt();
			System.out.print("영어 성적을 입력하세요. \n> ");
			eng = scan.nextInt();
			System.out.print("수학 성적을 입력하세요. \n> ");
			math = scan.nextInt();
			
			total = kor + eng + math;
			System.out.println("총점은 " + total + "점 입니다.");
			
			avg = total / sub;
			System.out.println("평균은 " + avg + "점 입니다.");
		}
		
	public static void main(String[] args) {
		new Sungjuk();
	}

}
