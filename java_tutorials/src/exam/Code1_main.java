package exam;
import java.util.Scanner;
public class Code1_main {

	public static void main(String[] args) {

		System.out.println("\"Hello World\"");
		System.out.println("%%");
		System.out.println("\\");
		System.out.println("C:\\");
		Scanner sc = new Scanner(System.in);
		// 정수
		int a =sc.nextInt();
		System.out.println(a);
		// 문자
		String b = sc.next();
		System.out.println(b);
		// 소수
		double c = sc.nextDouble();
		System.out.println(c);
		// 정수 2 개
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		System.out.println(d1+" "+d2);
		// 실수를 입력받아 소수점 둘째자리까지만 출력
		double e = sc.nextDouble();
		System.out.printf("%.2f",e);

	}

}
