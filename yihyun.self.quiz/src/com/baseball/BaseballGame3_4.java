package com.baseball;

import java.util.Scanner;
// 전역변수 초기화 
public class BaseballGame3_4 {
	Scanner scan = new Scanner(System.in);

	boolean isStop;
	String yN;

	int userInput;
	int ball, strike;
	int count;

	int[] userArr = new int[3]; // 사용자가 직접 입력한 세자리 숫자의 각 자릿수를 담을 배열
	int[] comArr = new int[3]; // 사용자가 직접 입력할 숫자 3개를 담을 배열

	// 야구게임 시작(컴퓨터가 랜덤으로 채번한 숫자를 배열에 저장) 및 종료 여부를 결정하는 메소드
	public void gameStart() {
		while (!isStop) {
			count = 0;
			yN = scan.nextLine();

			if (yN.equals("n") || yN.equals("y")) {

				switch (yN) {
					case "n":
						System.out.println("\r게임을 종료합니다.");
						System.out.println("=============== END ===============");
						System.exit(0);
					case "y":
						System.out.print("\r게임을 시작합니다. ");
	
						// 컴퓨터가 채번하는 랜덤 숫자 3개
						// System.out.println("\r" + "랜덤 숫자 3개 입니다.");
						for (int i = 0; i < comArr.length; i++) {
							comArr[i] = (int) (Math.random() * 9 + 1); // 랜덤 숫자를 배열의 길이(3)만큼 첫번째 인덱스 0을 제외하고 채번
	
							// 랜덤으로 채번한 숫자의 중복을 제거
							for (int j = 0; j < i; j++) {
								if (comArr[i] == comArr[j]) {
									i--;
								}
							}
							// 컴퓨터가 랜덤으로 채번한 숫자의 각 인덱스를 확인
							//System.out.println("comArr [" + i + "] = " + comArr[i]);
						}
				}
				break;
				
			} else if (!(yN.equals("n") && yN.equals("y"))) {
				System.out.print("잘못 입력하셨습니다. 다시 입력해주세요.\n> ");
			}
		}
		System.out.print("세자리 숫자를 입력해주세요.\n> ");
		gameArray();

	}

	// 사용자가 입력하는 세자리 숫자를 배열에 저장 및 컴퓨터가 채번한 랜덤 숫자를 비교하는 메소드
	public void gameArray() {
		while (!isStop) {
			
			userInput = scan.nextInt();

			if (100 > userInput || userInput > 999) {
				System.out.println("세자리 숫자만 입력해주세요.\n> ");
				continue;
			} else if (100 <= userInput && userInput <= 999) {
				for (int i = 0; i < 1; i++)

				// 사용자가 입력한 세자리 숫자를 각 자릿수를 출력하여 userArr 배열에 담기
				userArr[0] = userInput / 100; // 백의 자리
				userArr[1] = (userInput % 100) / 10; // 십의 자리
				userArr[2] = userInput % 10; // 일의 자리
				
				// 사용자 입력 값 중복 확인
				/*if(userArr[0] == userArr[1] || userArr[1] == userArr[2] || userArr[2] == userArr[3]) {
					System.out.println("세자리 수를 중복 없이 입력하세요.");
				}*/
				
				// userArr 배열의 각 인덱스에 담긴 숫자를 확인
				for (int i = 0; i < userArr.length; i++) {
					//System.out.println("userArr [" + i + "] = " + userArr[i]); // userArr 배열의 인덱스 출력
				}

				for (int i = 0; i < userArr.length; i++) {
					for (int j = 0; j < comArr.length; j++) {
						if ((userArr[i] == comArr[j]) && (i == j)) {
							strike++;
						} else if ((userArr[i] == comArr[j])) {
							ball++;
						}
					}
				}
			}
			//System.out.println("\nHINT ==> " + ball + "볼 " + strike + "스트라이크\n");
			count++;
			
			gameAnswer();
			
			ball = 0; strike = 0; // 초기화가 두번 되었다. (중복 - 제거 가능?)
		}
		return;
	}
	
	// 사용자와 컴퓨터의 숫자를 비교하여 정답을 입력하는 메소드
	public void gameAnswer() {
		while(!isStop) {
			if (strike == 3) {
				System.out.println("축하합니다. 정답입니다. " + count + "회 만에 맞추셨습니다.\n");
				break;
			} else if (strike < 3) { 
				System.out.print("\n정답이 아닙니다. 다시 시도해보세요. ");
				System.out.println("\n(HINT ==> " + ball + "볼 " + strike + "스트라이크)\n");
				System.out.print("세자리 숫자를 입력하세요.\n> ");
				
				return;
			}
		}
		
		ball = 0; strike = 0; // 초기화가 두번 되었다. (중복 - 제거 가능?)
		
		System.out.print("게임을 다시 시작하시겠습니까? (y/n)\n> ");
		yN = scan.nextLine();
		
		gameStart();
	}
	
	// 메인 메소드
	public static void main(String[] args) {
		System.out.println("========== Baseball Game ==========");
		System.out.print("게임을 시작하시겠습니까? (y/n)\n> ");
		int count = 0;
		
		BaseballGame3_4 b3 = new BaseballGame3_4();
		b3.gameStart();
	}

}
