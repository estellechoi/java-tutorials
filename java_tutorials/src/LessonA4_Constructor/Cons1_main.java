package LessonA4_Constructor;

public class Cons1_main {

	public static void main(String[] args) {
	
		// ⓐ main 함수 내에서 변수에 직접 전달
		Cons1 c1 = new Cons1();
		c1.n =100;
		c1.cal();
		c1.print();
		
		// ⓑ 메소드를 이용
		
		Cons1 c2 = new Cons1();
		c2.input();
		c2.cal();
		c2.print();
		
		// ⓒ 생성자를 이용 (생성자 → 초기값)
		
		Cons1 c3 = new Cons1();
		c3.cal();
		c3.print();
		
		

	}

}
