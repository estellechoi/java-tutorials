package test_String;
import java.util.Date;

public class Return {
	
	// return function → void 대신 자료형
	public int aaa() {
		int a=9;
		return a;
	}
	
	public int[] bbb() {
		int kor[] = new int[3];
		kor[0]= 100;
		kor[1]= 150;
		kor[2]= 110;
		return kor;
		
	}
	
	// 자료형이 Date(class) 인 경우
	// 객체변수를 return해서 쓸 수 있음 ! (Date today)
	public Date ccc() {
			Date today = new Date();
			return today;
	}

}