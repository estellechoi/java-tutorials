package test_fir;
import java.util.Scanner;
public class quest24 {

	public static void main(String[] args) {
		// 24. �л� 5���� ��,��,�� ������ �Է¹޾Ƽ� �հ�� ����� ���Ѵٰ� �Ҷ� 
	    // �� ������ ������ �迭�� ������ //  Scanner�� ���� �Է¹����� 
	    // ���� �հ�� ����� ���� sum,avg��� �̸��� �迭�� ������ �Է��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("kor, eng, mat in order.");
		
		int kor [] = new int [5];
		int eng [] = new int [5];
		int mat [] = new int [5];
		
		int sum[] = new int[5];
		int avg[] = new int[5];
		
		for (int i=0; i<kor.length; i++) {
			kor[i]=sc.nextInt();
			eng[i]=sc.nextInt();
			mat[i]=sc.nextInt();
			
			sum[i] = kor[i]+eng[i]+mat[i];
			avg[i] = sum[i]/3;
		}

		/* �迭 3�� ���� �Ϸ�
		       int kor[] = {100,90,90,90,100};
			   int eng[] = {10,20,20,20,10};
			   int mat[] = {50,50,50,50,50};
		 */
		
		for (int i=0; i<sum.length; i++) {
			System.out.print("SUM: "+sum[i]+" ");
		}	
		
		System.out.println(" ");
		
		for (int i=0; i<avg.length; i++) {
			System.out.print("AVG: "+avg[i]+" ");
		}
		
		

		

	}

}
