package test_draft;
import java.util.Scanner;
public class Retest1 {

	// 국,영,수,과학 성적 입력 받은 후 각 과목의 성적을 출력하시오. ex)수우미양가
	
	int kor;
	int eng;
	int mat;
	int sci;
	
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.println("kor: "); kor=sc.nextInt();
		System.out.println("eng: "); eng=sc.nextInt();
		System.out.println("mat: "); mat=sc.nextInt();
		System.out.println("sci: "); sci=sc.nextInt();
	}
	
	// 매개변수 (int aa) (값을 받아서 전달하는 변수)
	
	public void grade(int aa, String sub) {
		String result;
		if(aa>=90)
			result="수";
		else if(aa>=80)
			result="우";
		else if(aa>=70)
			result="미";
		else if(aa>=60)
			result="양";
		else
			result="가";
		System.out.println(sub+result);
	}
	
	// 같은 클래스 내에서 만들어진 함수 실행시키는 함수 !!!
	// 매개변수에 값을 넣어준다 ! (int aa) > (kor)
	
	public void grade_exe() {
		grade(kor, "국어: ");
		grade(eng, "영어: ");
		grade(mat, "수학: ");
		grade(sci, "과학: ");
	}

	

}
