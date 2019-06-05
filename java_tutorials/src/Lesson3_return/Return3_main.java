package Lesson3_return;

public class Return3_main {

	public static void main(String[] args) {
		
		// 3 명 국영수 점수 합의 평균
		
		Return3 r3 = new Return3();
		
		r3.input();
		int n1=r3.sum();
		
		r3.input();
		int n2=r3.sum();
		
		r3.input();
		int n3=r3.sum();
		
		int avg=(n1+n2+n3)/3;
		
		System.out.println(avg); // 0513 end.
		

	}

}
