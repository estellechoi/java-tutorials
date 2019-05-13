package test_draft;
import java.util.Scanner;
public class Test10 {

		// 10. Scanner를 통해 num1,num2라는 변수에 값을 저장한 후 둘중에 큰수를 출력하시오.
		
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		
		public void input() {
			num1=sc.nextInt();
			num2=sc.nextInt();
		}
		
		public void print() {
			if(num1>num2)
				System.out.println(num1);
			else if(num2>num1)
				System.out.println(num2);
			else
				System.out.println("num1 = num2 !");
		}
		
		



}
