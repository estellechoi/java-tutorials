package LessonA3_return;

import java.util.Scanner;

public class Retest2 {

	// �� ���� ���� ���ϴ� ���α׷��� ����ÿ�.
	// �� �� ���� �Է��� main()���� �Է��Ѵ�.

	int sum;
	public void sum(int aa, int bb) {
		sum = aa+bb;
	}
	
	public void print() {
		System.out.print(sum);
	}
	
	// �η�
	
	public void sum2() {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print(a+b);
	}

}
