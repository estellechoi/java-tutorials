package LessonA2_Class_main;

import java.util.Scanner;

public class functest {

	int a1;
	int a2;
	private int sum;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		a1=sc.nextInt();
		a2=sc.nextInt();
	}
	
	public int sum() {
		sum=a1+a2;
		return sum;
	}

}
