package test;
import java.util.Scanner;
public class func1_main {

	public static void main(String[] args) {
		// main() ������ ����
		
		// ��make a copy, named f1
		func1 f1= new func1(); 
		
		f1.input();
		f1.sum();
		f1.print();
		
		f1.input();
		f1.sum();
		f1.print();
		
		
		///////////////////////////////////////////////////////////////////////////
		
		// �Ű������� �ִ� �Լ��� ȣ���� ��, ���� ��������� �� !
		f1.total(5,3); 
		f1.print2();   // total() �Լ� ���� ��, �� ���� ���Ƽ� print2() �Լ� ����� ������ �ֳ� ?
		
		f1.total(1,1);
		f1.print2();
		
		f1.total(10,10);
		f1.print2();
		
		f1.total(100,100);
		f1.print2();
		
		//�Ű������� �Է°� �ֱ�..
		
		Scanner sc = new Scanner(System.in);
		
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		
		f1.total(a1,a2);
		f1.print2();

		
		}

}
