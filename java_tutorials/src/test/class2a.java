package test;
import java.util.Scanner;
public class class2a {
	
	int n1;
	int n2;
	int n3;
	int sum;

	public void in() {
		
		Scanner sc= new Scanner(System.in);
		n1=sc.nextInt();                        //*** int n1 �̶�� �ϸ� �ȵ� !!! n1 ������ ���� ����ٴ� �� 
		n2=sc.nextInt();                        //    in() �Լ� ������ �����Ǹ�, �Լ� ����� �ش� ������ �����
		n3=sc.nextInt();
	}
	
	public void printme() {
		
		sum = n1+n2+n3;
		System.out.println(sum);
	}

}
