package Lesson3_return;
import java.util.Scanner;
public class Retest_main2 {

	public static void main(String[] args) {
		
		// �� ���� ���� ���ϴ� ���α׷��� ����ÿ�.
		// �� �� ���� �Է��� main()���� �Է��Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		Retest2 t2 = new Retest2();
		
		t2.sum(n1,n2);
		t2.print();
		
		//�η�
		t2.sum2();

	}

}
