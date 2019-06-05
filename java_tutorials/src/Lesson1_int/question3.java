package Lesson1_int;
import java.util.Scanner;
public class question3 {

	public static void main(String[] args) {
		//3. 국,영,수 3과목의 점수를 입력받아 평균이 60점 미만이면
		//"재시험입니다" 출력하고 60점 이상이면 "축하합니다" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kor : "); int kor = sc.nextInt();
		System.out.println("Eng : ");int eng = sc.nextInt();
		System.out.println("Mat : ");int mat = sc.nextInt();
		
		int avg = kor+eng+mat;
		
		if (avg<60) {
			System.out.println("Please retry.");
		}
		else {
			System.out.println("Congratulations!");
		}
		
		
		



	}

}
