package Lesson4_Constructor;
import java.util.Scanner;
public class Array4_dimension {

	public static void main(String[] args) {
		
		// 5*5 2차원 배열 만드시오.
		
		int dim[][] = new int[5][5];
		int n=1;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				dim[i][j]=n;
				n=n+1;
			}
		}

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%3d", dim[i][j]);
			}
			System.out.println();
		}
	
		
		
		
		
		
		
		
		
		
		
		
	}	
}
