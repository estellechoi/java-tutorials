package test_fir;
import java.util.Scanner;
public class quest10 {

	public static void main(String[] args) {
		// 10. Scanner�� ���� num1,num2��� ������ ���� ������ �� ���߿� ū���� ����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("no.1 : "); int num1=sc.nextInt();
		System.out.print("no.1 : "); int num2=sc.nextInt();
		
		if (num1>num2) 
			System.out.println("result: "+num1);
		
		else
			System.out.println("result: "+num2);
		


	}

}
