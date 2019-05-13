package test;

import java.util.Scanner;

public class func1 {


		// 클래스는 속성과 메소드로 구성된다 ...
		// 만들고자하는 프로그램에 필요한 속성, 메소드
		// 속성 -> 값 : 기본변수, 배열, 객체변수(복사본 ..)
		// 메소드 -> 기능 : function() {}
		
		// 두 수를 입력받고, 합을 출력하라.
	
		int n1;
		int n2;
		int sum;
		
		// 접근권한(public) 정적/동적(static) 리턴자료형(void) function() {       }
		// void : do not save any return value after a function ends.
		// 매개변수 : a value is brought when a function needs it when being operated.
		// 리턴값 : return value means the result of operating a function.
		// (* 원래 함수는 실행 후 종료되면, 그 내용/값이 모두 사라짐 !)
		
		public void input() {    
			Scanner sc= new Scanner(System.in);
			
			n1=sc.nextInt();
			n2=sc.nextInt();
			
		}
		
		public void sum() {
			sum=n1+n2;
		}
		
		public void print() {
			System.out.println("The sum is "+sum);
		}
		
		//매개변수가 있는 함수 만들어보자 ( 매개변수 makes code cleaner)
		
		int total;
		
		public void total(int n3, int n4) {
			total=n3+n4;
		}
		
		public void print2() {
			System.out.println("The total is "+total);
		}

	
	}


