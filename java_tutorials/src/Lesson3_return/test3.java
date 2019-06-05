package Lesson3_return;
import java.util.Scanner;
public class test3 {

	int kor;
	int eng;
	int mat; // no value yet.
	
	int sum; 
	int avg;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
	}
	
	public void cal() {
		sum=kor+eng+mat;
		avg=sum/3;
	}
	
	public void print() {
		System.out.println("SUM : "+sum);
		System.out.println("AVG : "+avg);
	}

}
