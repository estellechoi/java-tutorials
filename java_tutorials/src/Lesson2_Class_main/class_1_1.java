package Lesson2_Class_main;
import java.util.Scanner;
public class class_1_1 {

	int n1;
	int n2;
	int sum;  // �� �Ӽ� ����� (���� or �迭)
	
	public void input() { // input(); �Լ��� ����� ���⿡�� �����Ѵ� / �Լ� �̸��� �������
		Scanner sc = new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt(); // ��
		                 // Scanner Ŭ������ ��ü���� sc / Scanner Ŭ������ �����ִ� next.Int(); ��� ����
	}
	
	public void cal() { // �� cal(); �Լ��� ����� ���⿡�� ����
		
		sum = n1+n2;
		System.out.println(sum);
		
	} 
	
	// ������ ��Ű���� main() �Լ� �ʿ� !

}
