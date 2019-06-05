package Lesson5_methods;

public class Over {

	// 입력된 수의 평균 구하기
	// Method overloading (매개변수의 갯수만 다르고, 이름 같은 함수 여러 개 생성 가능)
	
	public void avg(int a, int b) {
		
		int avg = (a+b)/2;
		System.out.println(avg);
	}
	
	public void avg(int a, int b, int c) {
		int avg=(a+b+c)/3;
		System.out.println(avg);
	}
	
	public void avg(int a, int b, int c, int d) {
		int avg=(a+b+c+d)/4;
		System.out.println(avg);
	}
	
	public void avg(int a, int b, int c, int d, int e) {
		int avg=(a+b+c+d+e)/5;
		System.out.println(avg);
	}
	
	

}
