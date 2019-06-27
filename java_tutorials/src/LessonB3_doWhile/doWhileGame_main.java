package LessonB3_doWhile;

import java.util.Scanner;

public class doWhileGame_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		doWhileGame game = new doWhileGame();
		int theSelected;

		do {
			System.out.println("1. a부터 b까지의 합 구하기");
			System.out.println("2. a부터 b까지 중 랜덤 숫자 뽑기");
			System.out.println("3. 3명 중 밥 살 사람 정하기");
			System.out.println("4. 종료");
			System.out.println("번호 선택 : ");
			theSelected = sc.nextInt();
			
			game.selectPrint(theSelected);
			
		} while (theSelected != 4);

	}

}
