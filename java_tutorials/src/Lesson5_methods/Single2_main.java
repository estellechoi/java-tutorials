package Lesson5_methods;
import java.util.Calendar;
import java.util.Scanner;

public class Single2_main {
	public static void main(String[] args) {
		// 계좌번호와 비밀번호 입력 없이 금액 조회하기
		
		// Single2 s = new Single2("00-000-000-000","1234");
		// s.print();
		
		Single2 s = Single2.getInstance();
		s.print();
		
		// *********부록***********
		// 클래스 참조 (싱글톤) → private 생성자
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getFirstDayOfWeek());
		
		// 클래스 복사 → not private 생성자
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		

	}

}
