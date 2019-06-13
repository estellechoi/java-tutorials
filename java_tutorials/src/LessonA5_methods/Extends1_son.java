package LessonA5_methods;

public class Extends1_son extends Extends1{
	
	// Overloading 시에는, 매개변수 없는 기본 생성자가 존재하지 않는다.
	Extends1_son() {
		System.out.println("Agree.");
	}
	
	
	// ★부모 클래스 생성자가 매개변수 갖고 있을 때
	
	Extends1_son(int par, int age) {
		// 자식 생성자가 매개변수 int par 값을 받아서 부모 생성자 int age 값으로 전달
		super(par);
		// this(); = Extends1_son(); 생성자를 의미
		// super(); = Extends1(); 부모 생성자 의미
		System.out.println("Son "+age);
	}

}
