package LessonA7_String;

import java.util.Scanner;

public class Split3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		String n[] = number.split("");
		int n1 = Integer.parseInt(n[0]);
		int n2 = Integer.parseInt(n[1]);

		System.out.println(n1 + n2);
		
		System.out.println("charAt으로 해보자 !");		
		// charAt으로 해보자 !
		String number2 = sc.next();
		char c1 = number2.charAt(0);
		char c2 = number2.charAt(1);
		
		// char → int 바꿀 때, '2' → 2 가 아닌 아스키코드값이 된다 !
		// 특정 상수를 빼줘야한다 ..! '0' => 48
		System.out.print((int)(c1-'0') + (int)(c2-'0'));

		

	}

}
