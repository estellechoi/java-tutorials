package LessonA1_int;
import java.util.Scanner;
public class quest6 {

	public static void main(String[] args) {
		// 6. 수학 점수를 Scanner로 입력받은 후, 60점 이상이면 "합격"을 출력하고 60점 미만이면 "불합격" 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("mat: "); int mat = sc.nextInt();
		
		if (mat>=60)
			System.out.print("Pass");
		else
			System.out.print("Fail");


	}

}
