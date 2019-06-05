package Lesson2_Class_main;
import java.util.Scanner;
public class class_1_1 {

	int n1;
	int n2;
	int sum;  // ⓐ 속성 만든다 (변수 or 배열)
	
	public void input() { // input(); 함수의 기능을 여기에서 정의한다 / 함수 이름도 내맘대로
		Scanner sc = new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt(); // ⓑ
		                 // Scanner 클래스의 객체변수 sc / Scanner 클래스가 갖고있는 next.Int(); 사용 가능
	}
	
	public void cal() { // ⓒ cal(); 함수의 기능을 여기에서 정의
		
		sum = n1+n2;
		System.out.println(sum);
		
	} 
	
	// 실행을 시키려면 main() 함수 필요 !

}
