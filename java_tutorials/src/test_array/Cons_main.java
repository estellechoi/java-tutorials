package test_array;

public class Cons_main {

	public static void main(String[] args) {
		
		//main class 변수들
		int kor=90;
		int eng=90;
		int mat=90;
		
		// 객체 인스턴스화
		// 객체변수 c1, 생성자 Cons();
		Cons c1 = new Cons(kor,eng,mat); // Cons(90,90,90)
		
		//생성자 함수에서 초기값을 받은 print() 함수 실행해보자.
		c1.print();

	}

}
