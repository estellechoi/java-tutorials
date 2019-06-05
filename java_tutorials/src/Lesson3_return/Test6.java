package Lesson3_return;
import java.util.Scanner;
public class Test6 {

	// 6. 수학 점수를 Scanner로 입력받은 후, 60점 이상이면 "합격"을 출력하고 60점 미만이면 "불합격" 출력하시오.
	
	int mat;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		mat=sc.nextInt();
	}
	
	public void print() {
		if(mat>=60)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}

}
