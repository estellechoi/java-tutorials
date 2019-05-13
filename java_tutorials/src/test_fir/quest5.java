package test_fir;
import java.util.Scanner;
public class quest5 {

	public static void main(String[] args) {
		
		// 5. 영어점수(0~100점)를 Scanner로 입력 받은 후, ABCDE를 출력하시오. (90점이상 A 80점이상 B ..)
		
		
		Scanner sc= new Scanner(System.in);
		System.out.print("eng: "); int eng = sc.nextInt();
		
		if (eng<=100) {
			
			String result = null;
			
			if (eng>=90)
				result="A";
			else if (eng>=80)
				result="B";
			else if (eng>=70)
				result="C";
			else if (eng>=60)
				result="D";
			else
				result="E";
			
			System.out.print("Your grade is "+result);
			
				
		}
		else {
			System.out.print("Wrong Input !");
		}
		



	}

}
