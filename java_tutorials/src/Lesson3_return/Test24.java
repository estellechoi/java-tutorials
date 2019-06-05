package Lesson3_return;
import java.util.Scanner;
public class Test24 {

	// 24. 학생 5명의 국,영,수 성적을 입력받아서 합계와 평균을 구한다고 할때 
    // 각 과목의 점수를 배열로 만든후 //  Scanner를 통해 입력받은후 
    // 과목별 합계와 평균을 각각 sum,avg라는 이름의 배열로 만든후 입력하시오.
	
	int kor[]= new int[5];
	int eng[]= new int[5];
	int mat[]= new int[5];
	
	int sum[]= new int[5];
	int avg[]= new int[5];
	
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		for(int i=0; i<=4; i++) {
			System.out.println("kor : "); kor[i]=sc.nextInt();
			System.out.println("eng : "); eng[i]=sc.nextInt();
			System.out.println("mat : "); mat[i]=sc.nextInt();
		}
	}
	
	public void cal() {
		for(int i=0; i<=4; i++) {
			sum[i]=kor[i]+eng[i]+mat[i];
			avg[i]=sum[i]/3;
		}
	}
	
	public void print() {
		for(int i=0; i<=4; i++) {
		System.out.println
		("sum "+i+" : "+sum[i]+" / avg "+i+" : "+avg[i]);
	
		}
	}

}
