package test_array;

public class Cons1 {

	// 속성 : 변수
	int n;
	int total;
	
	// 생성자 : 기능
	// 클래스 내의 속성의 초기값을 주는 것
	Cons1() {
		n=88;
	}
	
	// 메소드 : 기능
	public void input() {
		n=99;
	}
	
	public void cal() {
		for(int i=0; i<=n; i++)
			total=total+i;
	}
	
	public void print() {
		System.out.println(total);
	}
}
