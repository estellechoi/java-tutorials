package Exam2;
// 라이브러리를 통해 값을 입력하는 메소드를 완성하시오.
import java.util.Scanner;
public class Input {
	
	int kor;
	int eng;
	int mat;
	
	Scanner sc = new Scanner(System.in);
	
	public void input() {
	
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		
	}

}
