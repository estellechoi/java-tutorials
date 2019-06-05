package Lesson2_Class_main;
import java.util.Scanner;
public class func2 {
	
	int n1;
	int n2;
	int sum;
	
	// ⓐ매개변수 없는 함수 (함수 내에서 값을 입력..)
	
	public void sum1() {
		Scanner sc= new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		sum=n1+n2;
	}
	
	// ⓑ매개변수 있는 함수 ..↓ (함수 밖에서 값을 가져옴)
	
	public void sum2(int a1, int a2) {
		sum=a1+a2;
	}
	
	// 출력 함수
	public void print() {
		System.out.println(sum);
	}
	
	

	
}
