package exam;
import java.util.Scanner;
public class Code1_main {

	public static void main(String[] args) {

		System.out.println("\"Hello World\"");
		System.out.println("%%");
		System.out.println("\\");
		System.out.println("C:\\");
		Scanner sc = new Scanner(System.in);
		// ����
		int a =sc.nextInt();
		System.out.println(a);
		// ����
		String b = sc.next();
		System.out.println(b);
		// �Ҽ�
		double c = sc.nextDouble();
		System.out.println(c);
		// ���� 2 ��
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		System.out.println(d1+" "+d2);
		// �Ǽ��� �Է¹޾� �Ҽ��� ��°�ڸ������� ���
		double e = sc.nextDouble();
		System.out.printf("%.2f",e);

	}

}
