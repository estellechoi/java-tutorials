package LessonB3_doWhile;

import java.util.Scanner;

public class doWhileGame {

	Scanner sc = new Scanner(System.in);
	int a;
	int b;

	public void inputAB() {
		System.out.println("a : ");
		a = sc.nextInt();
		System.out.println("b : ");
		b = sc.nextInt();
	}

	public void selectPrint(int theSelected) {

		switch (theSelected) {
		case 1:
			inputAB();
			sum(a, b);
			break;
		case 2:
			inputAB();
			random(a, b);
			break;
		case 3:
			bob();
			break;
		case 4:
			System.out.println("���α׷� ����");
			break;
		default:
			System.out.println("�߸��� ����");
		}
	}

	public void sum(int a, int b) {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum = sum + i;
		}
		System.out.println("�� : " + sum);
	}

	public void random(int a, int b) {
		// b - a + 1
		int ran = (int) Math.random() * (b - a + 1) + a;
		System.out.println("��� : " + ran);
	}

	public void bob() {
		String people[] = new String[3];
		for (int i = 0; i < people.length; i++) {
			System.out.println("��� " + (i + 1) + " : ");
			people[i] = sc.next();
		}
		int i = (int) Math.random() * 3;
		System.out.println("�� �� ��� : " + people[i]);
	}

}
