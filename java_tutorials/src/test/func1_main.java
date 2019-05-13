package test;
import java.util.Scanner;
public class func1_main {

	public static void main(String[] args) {
		// main() 내에서 실행
		
		// ⓐmake a copy, named f1
		func1 f1= new func1(); 
		
		f1.input();
		f1.sum();
		f1.print();
		
		f1.input();
		f1.sum();
		f1.print();
		
		
		///////////////////////////////////////////////////////////////////////////
		
		// 매개변수가 있는 함수를 호출할 때, 값을 지정해줘야 함 !
		f1.total(5,3); 
		f1.print2();   // total() 함수 실행 후, 왜 값이 남아서 print2() 함수 실행시 열향을 주나 ?
		
		f1.total(1,1);
		f1.print2();
		
		f1.total(10,10);
		f1.print2();
		
		f1.total(100,100);
		f1.print2();
		
		//매개변수에 입력값 넣기..
		
		Scanner sc = new Scanner(System.in);
		
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		
		f1.total(a1,a2);
		f1.print2();

		
		}

}
