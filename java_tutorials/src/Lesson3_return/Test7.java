package Lesson3_return;
import java.util.Scanner;
public class Test7 {

	
		// 7. 국,영,수의 점수를 Scanner로 입력받은 후 새로운 선택값을 1,2,3 중에 하나를 입력받아서
		// 1이 입력되면 국어점수를 출력 2를 입력받으면 영어점수를 출력, 3을 입력받으면 수학 점수를 출력하시오.
		
		int kor;
		int eng;
		int mat;
		int sel;
		Scanner sc = new Scanner(System.in); // can use 'sc' in any function.
		
		public void input() {
			
			int aaa; // *지역변수 : made in a function, not in a class.
			
			kor=sc.nextInt();
			eng=sc.nextInt();
			mat=sc.nextInt();
			System.out.println("1:kor, 2:eng, 3:mat ");
			sel=sc.nextInt();
		}
		
		public void print() {
			switch(sel) {
			case 1: System.out.print(kor); break;
			case 2: System.out.print(eng); break;
			case 3: System.out.print(mat); break;
			default: System.out.print("Wrong Input!");
			}
				
		}
	
}
