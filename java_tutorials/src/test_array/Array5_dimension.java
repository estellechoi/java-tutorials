package test_array;

import java.util.Scanner;

public class Array5_dimension {

	public static void main(String[] args) {
		
		// 3�� �л��� ��,��,�� ���� �Է� / �� ���� �հ�� ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		int grade[][] =new int[5][3];
		
		// ���� �Է�
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("��"); grade[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		
		// �հ�� ���
		
		for(int j=0; j<3; j++) {
			grade[3][j] = 0;
			for(int i=0; i<3; i++) {
				grade[3][j] = grade[3][j] + grade[i][j]; 
			}
			grade[4][j] = grade[3][j]/3;
		}
		
		//���
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("%3d", grade[i][j]);
			}
			System.out.println();
		}

		
		
		
	}

}
