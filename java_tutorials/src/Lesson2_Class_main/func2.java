package Lesson2_Class_main;
import java.util.Scanner;
public class func2 {
	
	int n1;
	int n2;
	int sum;
	
	// �͸Ű����� ���� �Լ� (�Լ� ������ ���� �Է�..)
	
	public void sum1() {
		Scanner sc= new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		sum=n1+n2;
	}
	
	// �θŰ����� �ִ� �Լ� ..�� (�Լ� �ۿ��� ���� ������)
	
	public void sum2(int a1, int a2) {
		sum=a1+a2;
	}
	
	// ��� �Լ�
	public void print() {
		System.out.println(sum);
	}
	
	

	
}
