package LessonB3_doWhile;

import java.util.Scanner;

public class doWhileGame_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		doWhileGame game = new doWhileGame();
		int theSelected;

		do {
			System.out.println("1. a���� b������ �� ���ϱ�");
			System.out.println("2. a���� b���� �� ���� ���� �̱�");
			System.out.println("3. 3�� �� �� �� ��� ���ϱ�");
			System.out.println("4. ����");
			System.out.println("��ȣ ���� : ");
			theSelected = sc.nextInt();
			
			game.selectPrint(theSelected);
			
		} while (theSelected != 4);

	}

}
