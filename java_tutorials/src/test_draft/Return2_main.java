package test_draft;

import java.util.Scanner;

public class Return2_main {

	public static void main(String[] args) {
		
		Return2 r2 = new Return2();
		
		r2.sum();
		// System.out.println(r2.sum); �Ұ�
		int total = r2.sum2();
		System.out.println(total);
		
		// nextInt() �����Լ����� ���ο� ���� a�� ���� �� �ִ� �� !
		Scanner sc = new Scanner(System.in); //��Ŭ���� ����
		int a = sc.nextInt(); //�ΰ�ü���� sc �Լ��� ���ϰ� �ޱ�

	}

}
