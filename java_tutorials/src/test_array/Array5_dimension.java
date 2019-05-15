package test_array;

import java.util.Scanner;

public class Array5_dimension {

	public static void main(String[] args) {
		
		// 3명 학생의 국,영,수 점수 입력 / 각 과목 합계와 평균 출력
		
		Scanner sc = new Scanner(System.in);
		
		int grade[][] =new int[5][3];
		
		// 점수 입력
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("입"); grade[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		
		// 합계와 평균
		
		for(int j=0; j<3; j++) {
			grade[3][j] = 0;
			for(int i=0; i<3; i++) {
				grade[3][j] = grade[3][j] + grade[i][j]; 
			}
			grade[4][j] = grade[3][j]/3;
		}
		
		//출력
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("%3d", grade[i][j]);
			}
			System.out.println();
		}

		
		
		
	}

}
