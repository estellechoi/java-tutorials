package Lesson5_methods;

public class Extends1_main {

	public static void main(String[] args) {
		
		Extends1_son s0 =new Extends1_son();
		
		// 부모 생성자의 매개변수 int age 초기값을,
		// 자식 클래스 복사시에 int par 값으로 넣어줌
		
		Extends1_son s1 = new Extends1_son(60, 27);
		// 매개변수에 들어가는 60, 27은 arguments 라 하는듯 ?
		

	}

}
