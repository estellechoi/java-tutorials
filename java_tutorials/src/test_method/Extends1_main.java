package test_method;

public class Extends1_main {

	public static void main(String[] args) {
		
		Extends1_son s0 =new Extends1_son();
		
		// 부모 생성자의 매개변수 int age 초기값을,
		// 자식 클래스 복사시에 int par 값으로 넣어줌
		Extends1_son s1 = new Extends1_son(60, 27);
		

	}

}
