package test_fir;
import java.util.Scanner;
public class quest24 {

	public static void main(String[] args) {
		// 24. 학생 5명의 국,영,수 성적을 입력받아서 합계와 평균을 구한다고 할때 
	    // 각 과목의 점수를 배열로 만든후 //  Scanner를 통해 입력받은후 
	    // 과목별 합계와 평균을 각각 sum,avg라는 이름의 배열로 만든후 입력하시오.
		
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

		/* 배열 3개 생성 완료
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
