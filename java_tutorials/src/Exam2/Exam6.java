package Exam2;
//a부터 b까지의 합을 구하고 출력하는 프로그램을 조건에 맞게 완성하시오.
// 합을 구해서 출력하는 메소드의 이름은 chul()
// 매개변수가 없으면 1~100, 매개변수가 1개면 1~입력값, 매개변수가 두개면 입력값 ~ 입력값
// 클래스 이용하여 속성, 메소드 구현
public class Exam6 {
	
	int start;
	int end;
	int sum;
	
	Exam6() {
		start=1;
		end=100; 
	}
	
	Exam6(int a) {
		start=1;
		end=a;
	}
	
	Exam6(int a, int b) {
		if(a<=b) {
			start=a;
			end=b;
		}
		else {
			start=b;
			end=a;
		}
	}
	public void sum() {
		for(int i=start; i<=end; i++)
			sum=sum+i;
		System.out.println(sum);
	}
}
