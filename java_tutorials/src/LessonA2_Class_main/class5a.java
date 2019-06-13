package LessonA2_Class_main;
import java.util.Scanner;
public class class5a {

	// 24. 학생 5명의 국,영,수 성적을 입력받아서 합계와 평균을 구한다고 할때 
    // 각 과목의 점수를 배열로 만든후 //  Scanner를 통해 입력받은후 
    // 과목별 합계와 평균을 각각 sum,avg라는 이름의 배열로 만든후 입력하시오.
	
	int kor[] = new int[5];
	int eng[] = new int[5];
	int mat[] = new int[5];
	
	int sum[] = new int[5];
	int avg[] = new int[5];
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<=4; i++) {
			kor[i] = sc.nextInt();
			eng[i] = sc.nextInt();
			mat[i] = sc.nextInt();
		}
	}
	
	public void cal() {
		
		for(int i=0; i<=4; i++) {
		sum[i]=kor[i]+eng[i]+mat[i];
		avg[i]=sum[i]/3;
		}
		
		for(int i=0;i<=4; i++) {
		
		System.out.println("SUM: "+sum[i]+" AVG: "+avg[i]);
		}

	}
	
	

}
