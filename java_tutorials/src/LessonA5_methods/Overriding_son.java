package LessonA5_methods;
/* 
$ 오버로딩 : 같은 이름의 메소드/생성자를 여러 개 쌓으면서 인자 수/자료형을 다르게 함
         → 메소드 오버로딩, 생성자 오버로딩
$ 오버라이딩 : 상위 클래스의 메소드와 이름과 용례(signature)가 같은 함수를 하위 클래스에서 재정의
*/

public class Overriding_son extends Overriding {
	
	public void aa() {
		System.out.println("what");
	}
	
	// Overriding 오버라이딩
	public void print() {
		System.out.println("hey ?");
	}
	
	// Overloading 오버로딩
	public void print(int a) {
		System.out.println(a);
		
	}
}


