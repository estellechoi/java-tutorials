package test_draft;
import java.util.Scanner;
public class Test8_r {

	// use 매개변수.
	
	int kor;
	int eng;
	int mat;
	int sel;
	Scanner sc = new Scanner(System.in); 
	
	// 입력 함수
	public void input() {
				
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		System.out.println(" 1:kor, 2:eng, 3:mat ");
		sel=sc.nextInt();
	}
	
	// 점수 함수 with 매개변수
	public void result(int s, String str) {
		String result=null;
			if(s>=90)
				result="A";
			else if(s>=80)
				result="B";
			else if(s>=70)
				result="C";
			else if(s>=60)
				result="D";
			else
				result="E";
			System.out.println(str+result);
		}
	
	
	// 출력함수
	public void print() {
		switch(sel) {
		case 1: result(kor,"kor: "); break; // 함수 in 함수
		case 2: result(eng,"eng: "); break;
		case 3: result(mat,"mat: "); break;
		default: System.out.print("Wrong Input!");
		}
			
	}


}
