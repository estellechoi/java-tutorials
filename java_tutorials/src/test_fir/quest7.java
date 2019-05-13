package test_fir;
import java.util.Scanner;
public class quest7 {

	public static void main(String[] args) {
		
		// 7. 국,영,수의 점수를 Scanner로 입력받은 후 새로운 선택값을 1,2,3 중에 하나를 입력받아서
		// 1이 입력되면 국어점수를 출력 2를 입력받으면 영어점수를 출력, 3을 입력받으면 수학 점수를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("kor: "); int kor = sc.nextInt();
		System.out.print("eng: "); int eng = sc.nextInt();
		System.out.print("mat: "); int mat = sc.nextInt();
		
		System.out.print("Select a number from 1 to 3. ");
		
		
		int select = sc.nextInt(); // select=1; 2; 3;
		
		switch (select) {
		
		case 1 : System.out.print(kor); break;
		case 2 : System.out.print(eng); break;
		case 3 : System.out.print(mat); break;
		default: System.out.print("You selected wrong number.");
		}
		
		

		

	}

}
