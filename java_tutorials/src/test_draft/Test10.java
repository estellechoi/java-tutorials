package test_draft;
import java.util.Scanner;
public class Test10 {

		// 10. Scanner�� ���� num1,num2��� ������ ���� ������ �� ���߿� ū���� ����Ͻÿ�.
		
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
