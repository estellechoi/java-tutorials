package test;
import java.util.Scanner;
public class class2a {
	
	int n1;
	int n2;
	int n3;
	int sum;

	public void in() {
		
		Scanner sc= new Scanner(System.in);
		n1=sc.nextInt();                        //*** int n1 이라고 하면 안됨 !!! n1 변수를 새로 만든다는 뜻 
		n2=sc.nextInt();                        //    in() 함수 내에서 생성되며, 함수 종료시 해당 변수도 사라짐
		n3=sc.nextInt();
	}
	
	public void printme() {
		
		sum = n1+n2+n3;
		System.out.println(sum);
	}

}
