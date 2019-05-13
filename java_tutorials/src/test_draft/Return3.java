package test_draft;
import java.util.Scanner;
public class Return3 {
	
	// 3 명 국영수 점수 합과 평균
	
	Scanner sc = new Scanner(System.in);
	int kor;
	int eng;
	int mat;
	int sum;
	
	public void input() {
		
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
	}

	//리턴함수 
	public int sum() {
		
		sum=kor+eng+mat;
		return sum;
	}

}
