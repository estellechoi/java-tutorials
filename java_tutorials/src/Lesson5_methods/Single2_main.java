package Lesson5_methods;
import java.util.Calendar;
import java.util.Scanner;

public class Single2_main {
	public static void main(String[] args) {
		// ���¹�ȣ�� ��й�ȣ �Է� ���� �ݾ� ��ȸ�ϱ�
		
		// Single2 s = new Single2("00-000-000-000","1234");
		// s.print();
		
		Single2 s = Single2.getInstance();
		s.print();
		
		// *********�η�***********
		// Ŭ���� ���� (�̱���) �� private ������
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getFirstDayOfWeek());
		
		// Ŭ���� ���� �� not private ������
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		

	}

}
