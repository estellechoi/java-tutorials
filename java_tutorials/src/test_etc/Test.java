package test_etc;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		// 대입연산자 사용시, 오른쪽 = 왼쪽 자료형 같아야 함
				
		//ⓐ 변수
			
		int a = 99;
		int b = a;

		//char aa = b;  자료형 다름
				
		//ⓑ 배열
		
		int kor[] = new int[3];
		kor[0]=100;
		kor[1]=90;
		kor[2]=80;
		
		int kk[] = kor;
		
		System.out.println(kk[2]);
				
		//객채
		Date today=new Date();
		System.out.println(today.getDate());
				
		Date t = today;
		System.out.println(t.getDate());

	}

}
