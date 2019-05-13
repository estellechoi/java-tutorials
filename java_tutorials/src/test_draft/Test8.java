package test_draft;
import java.util.Scanner;
public class Test8 {

	// 7. 국,영,수의 점수를 Scanner로 입력받은 후 새로운 선택값을 1,2,3 중에 하나를 입력받아서
	// 1이 입력되면 국어점수를 출력 2를 입력받으면 영어점수를 출력, 3을 입력받으면 수학 점수를 출력하시오.
	// 8. 7번 문제에서 각 과목 점수대신 수,우,미,양,가를 출력하시오.
	
	int exam[] = new int[3];
	int sel;
	Scanner sc = new Scanner(System.in);
	String result[]= new String[3];
	
	public void input() {
		System.out.println("kor, eng, mat score: ");
		for(int i=0; i<exam.length; i++)
			exam[i]=sc.nextInt();
		System.out.println("1: kor, 2: eng, 3: mat ");
		sel=sc.nextInt();
	}
	
	public void result() {

		for(int i=0; i<3; i++) {
			if(exam[i]>=90)
				result[i]="A";
			else if(exam[i]>=80)
				result[i]="B";
			else if(exam[i]>=70)
				result[i]="C";
			else if(exam[i]>=60)
				result[i]="D";
			else
				result[i]="E";
		}
	}
		
	public void print() {
		switch(sel) {
		case 1: System.out.println(result[0]); break;
		case 2: System.out.println(result[1]); break;
		case 3: System.out.println(result[2]); break;
		default: System.out.println("Wrong Input!");
		}
	}

}
