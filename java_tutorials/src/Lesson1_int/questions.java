package Lesson1_int;
import java.util.Scanner;
public class questions {

	public static void main(String[] args) {
		// 1. '안녕하세요'라는 문자를 Scanner로 입력받은 수만큼 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Hello.");
		}



	}

}
