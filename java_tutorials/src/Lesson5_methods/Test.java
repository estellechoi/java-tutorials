package Lesson5_methods;

public class Test {
	
	int kor=100;
	
	// 생성자
	Test() {
		System.out.println("hello");
	}
	//메소드
	public void aa() {
		System.out.println("function 1");
	}
	
	public void bb() {
		System.out.println("function 2");
	}
	
	private void ee() {                      // 상속 불가
		System.out.println("function 5");
	}

}
