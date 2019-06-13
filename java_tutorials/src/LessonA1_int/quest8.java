package LessonA1_int;
import java.util.Scanner;
public class quest8 {

	public static void main(String[] args) {
		// 8. 7번 문제에서 각 과목 점수대신 수,우,미,양,가를 출력하시오.
		
		int grade [] = new int [3];
		String result [] = new String [3];
		
		Scanner sc = new Scanner(System.in);
		 
		
		for (int i=0; i<grade.length; i++) {
			System.out.print("Input our score."); grade[i] = sc.nextInt();
	
		if (grade[i]>=90)
			result[i]="A";
		else if (grade[i]>=80)
			result[i]="B";
		else if (grade[i]>=70)
			result[i]="C";
		else if (grade[i]>=60)
			result[i]="D";
		else
			result[i]="E";
		
		System.out.println("Your grade : "+result[i]);
		
		}
		
		
		System.out.print("Select a number from 1 to 3. ");
		int select = sc.nextInt();
		
		switch (select) {
		
		case 1 : System.out.print("kor grade: "+result[0]); break;
		case 2 : System.out.print("eng grade: "+result[1]); break;
		case 3 : System.out.print("mat grade: "+result[2]); break;
		default: System.out.print("You selected wrong number.");
		}
		

	}

}
