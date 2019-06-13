package LessonA3_return;

import java.util.Scanner;

public class Retest2 {

	// 두 수의 합을 구하는 프로그램을 만드시오.
	// 단 두 수의 입력은 main()에서 입력한다.

	int sum;
	public void sum(int aa, int bb) {
		sum = aa+bb;
	}
	
	public void print() {
		System.out.print(sum);
	}
	
	// 부록
	
	public void sum2() {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print(a+b);
	}

}
