package Lesson4_Constructor;
import java.util.Scanner;
public class Array6_dimension {

	public static void main(String[] args) {
		
		// 5*5 �迭 1 ~ 25 �Է� ���
		Scanner sc = new Scanner(System.in);
		
		int aa[][] = new int[5][5];
		int n=1;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				aa[i][j]=n;
				n=n+1;
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%3d", aa[i][j]);
			}
			System.out.println();
		}
		
		// 7*3 �迭 1 ~ 21 �Է� ���
		
		int bb[][] = new int[7][3];
		int m=1;
		for(int i=0; i<7; i++) {
			for(int j=0; j<3; j++) {
				bb[i][j] = m;
				m=m+1;
			}
		}
		
		for(int i=0; i<7; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("%3d", bb[i][j]);
			}
			System.out.println();
		}
		
		// 4*8 �迭 1 ~ 32 �Է� ���
		
		int cc[][] = new int[4][8];
		int l=1;
		for(int i=0; i<4; i++) {
			for(int j=0; j<8; j++) {
				cc[i][j] = l;
				l=l+1;
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<8; j++) {
				System.out.printf("%3d",cc[i][j]);
			}
			System.out.println();
		}

		
		
	}

}
