package Exam1;
import java.util.Scanner;
abstract class Good
{
	int kor;
	int eng;
	int mat;
	// 과목의 합
	public abstract void hap();
	
	// 평균
	public abstract void avg();
	
	// 과목 점수 입력
	public abstract void input();
	
	// 평균과 합계 출력
	public abstract void chul();
}
// 위와 같은 추상클래스가 있다. 3과목을 입력하여
// 합,평균을 구하고 출력하는 메소드를 완성하시오.
public class Test7 extends Good 
{
	int hap;
	int avg;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
	}
	
	public void hap() {
		hap=kor+eng+mat;
	}
	
	public void avg() {
		avg=(kor+eng+mat)/3;
	}
	
	public void chul() {
		System.out.println("합 : "+hap+" / 평 : "+avg);
	}
	

}
