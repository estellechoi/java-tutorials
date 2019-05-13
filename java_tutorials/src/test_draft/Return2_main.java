package test_draft;

import java.util.Scanner;

public class Return2_main {

	public static void main(String[] args) {
		
		Return2 r2 = new Return2();
		
		r2.sum();
		// System.out.println(r2.sum); 불가
		int total = r2.sum2();
		System.out.println(total);
		
		// nextInt() 리턴함수여서 새로운 변수 a로 받을 수 있는 것 !
		Scanner sc = new Scanner(System.in); //ⓐ클래스 복사
		int a = sc.nextInt(); //ⓑ객체변수 sc 함수의 리턴값 받기

	}

}
