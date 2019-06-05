package Lesson3_return;
import java.util.Scanner;
public class Retest_main2 {

	public static void main(String[] args) {
		
		// 두 수의 합을 구하는 프로그램을 만드시오.
		// 단 두 수의 입력은 main()에서 입력한다.
		
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		Retest2 t2 = new Retest2();
		
		t2.sum(n1,n2);
		t2.print();
		
		//부록
		t2.sum2();

	}

}
