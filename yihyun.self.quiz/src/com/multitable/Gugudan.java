package com.multitable;

public class Gugudan {
	int min, max; // 전역 변수 설정 - 생성자 파라미터 값 설정 위해서
	
	public void gugudanTable(int min, int max) {
		this.min = min; // 최소값 (시작 단)
		this.max = max; // 최댓감 (끝 단)
		
		for(int i=min; i<=max; i++) { // min단 부터 max단 까지
			if(i == max + 1) { // max 까지 출력하고 싶은데 max가 되는 순간 멈춰버려서 +1을 했다.
			}
			System.out.println(i + "단 : ");
			
			for(int j=1; j<=9; j++) { // 1부터 9까지 곱하기
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}
	}
	public static void main(String[] args) {
		Gugudan g = new Gugudan();
		g.gugudanTable(4, 5); // 시작 단과 끝 단을 파라미터로
	}
}
