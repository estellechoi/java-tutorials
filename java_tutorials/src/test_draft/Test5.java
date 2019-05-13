package test_draft;
import java.util.Scanner;
public class Test5 {

	// 5. 영어점수(0~100점)를 Scanner로 입력 받은 후, ABCDE를 출력하시오. (90점이상 A 80점이상 B ..)
	
	int eng;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		eng=sc.nextInt();
	}
	
	public void print() {
		String result=null;
		if(eng>=90)
			result="A";
		else if(eng>=80)
			result="B";
		else if(eng>=70)
			result="C";
		else if(eng>=60)
			result="D";
		else
			result="E";
		
		System.out.println(result);
			
	}
	

}
