package com.baseball;

import java.util.Scanner;

public class BaseballGame2 {
	int userInput;
	int ball;
	int strike;
	int count; 
	
	boolean isOk; // false 초기화 되어있으니 ! 사용하여 true로 변경할 것 
	
	public BaseballGame2() { // 생성자
		
	} 
	
	public void gameStart() {
		Scanner scan = new Scanner(System.in);
		
		int[] user = new int[1]; // 컴퓨터가 랜덤으로 뽑을 숫자 3개를 담을 배열
		int[] userArr = new int[3]; // 사용자가 직접 입력한 세자리 숫자의 각 자릿수를 담을 배열
		int[] comArr = new int[3]; // 사용자가 직접 입력할 숫자 3개를 담을 배열
		
		System.out.println("========== Baseball Game ==========");
		System.out.print("게임을 시작하시겠습니까? 1.Yes 2.No \n> ");
		
		while(!isOk) {
			int yN = scan.nextInt();
			switch(yN) {
				case 2:
					System.out.println("게임을 종료합니다.");
					break;
				case 1:
					System.out.println("게임을 시작합니다.");
					System.out.print("세자리 숫자를 입력해주세요. \n> ");
					
					while(!isOk) {
						userInput = scan.nextInt();
						
						if(100 > userInput || userInput > 999) {
							System.out.print("세자리 숫자만 입력해주세요. \n> ");
							continue;
						} else {
							do {
								if(100 <= userInput && userInput <= 999) {
									for(int i=0; i<user.length; i++) {
										// 사용자가 입력한 숫자가	user 배열에 담긴 것을 확인
										System.out.println("user [" + i + "] = " + userInput);
										
										// 사용자가 입력한 세자리 숫자를 각 자릿수를 출력하여 userArr 배열에 담기
										userArr[0] = userInput / 100; 			// 백의 자리
										userArr[1] = (userInput % 100) / 10;	// 십의 자리 
										userArr[2] = userInput % 10;			// 일의 자리
											
										// userArr 배열의 각 인덱스에 담긴 숫자를 확인
										for (i=0; i<userArr.length; i++) {
											System.out.println("userArr [" + i + "] = " + userArr[i]);  // userArr 배열의 인덱스 출력
										}
										
										// 컴퓨터가 채번하는 랜덤 숫자 3개
										System.out.println("\r" + "랜덤 숫자 3개 입니다.");
										for (i=0; i<comArr.length; i++) {
											int ranCom = (int) (Math.random() * 9 + 1); // 랜덤 숫자를 배열의 길이(3)만큼 첫번째 인덱스 0을 제외하고 채번
											
											// 랜덤으로 채번한 숫자의 중복을 제거
											for(int j=0; j<i; j++) {
												if(comArr[i] == comArr[j]) {
													i--;
												}
											}
											
											// 컴퓨터가 랜덤으로 채번한 숫자의 각 인덱스를 확인
											comArr[i] = ranCom; // 컴퓨터가 랜덤으로 채번한 값을 comArr 배열에 담기
											System.out.println("comArr [" + i + "] = " + ranCom);
										}
										break;
									}
								}
							} while(!(100 <= userInput && userInput <= 999));
							
							//userArr 배열과 comArr 배열을 비교
							for (int i = 0; i < userArr.length; i++) {
								for (int j = 0; j < comArr.length; j++) {
									if ((userArr[i] == comArr[j]) && (i == j)) {
										strike++;
									} else if ((userArr[i] == comArr[j]) && (i != j)) {
										ball++;
									}
								}
							}
							System.out.println("\r" + ball + "볼 " + strike + "스트라이크");
						}
						while(!isOk) {
							if(strike == 3) {
								System.out.println("축하합니다. 정답입니다. " + count + "회만에 맞추셨습니다.");
								break;
							} else if (count == 9){
								System.out.println("기회를 모두 사용하셨습니다.");
							} else {
								System.out.println("틀렸습니다. 다시 시도해보세요.");
								count++;
							}
						}
					}
			}
		}
	}
	
	public static void main(String[] args) {
		BaseballGame2 b1 = new BaseballGame2();
		b1.gameStart();
		b1.isOk = false;
		
	}

}