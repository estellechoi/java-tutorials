package Lesson1_int;
import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		//2. 국,영,수 3과목의 점수를 입력받아 합계와 평균을 출력하시오.


		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kor : "); int kor = sc.nextInt();
		System.out.println("Eng : "); int eng = sc.nextInt();
		System.out.println("Mat : "); int mat = sc.nextInt();
		
		System.out.println("Avg : "+(kor+eng+mat)/3);
		System.out.println("Sum : "+(kor+eng+mat));
		
		

	}

}
