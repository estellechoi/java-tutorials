package LessonA4_Constructor;

public class ConsThis3 {
	
	ConsThis3() {
		this(50,100);
		
		// this(50) → ConsThis3(int a) 호출
		// this(50,100) → ConsThis3(int a, int b) 호출
		
	}
	
	ConsThis3(int a) {
		System.out.println("매개변수 하나");
	}
	
	ConsThis3(int a, int b) {
		System.out.println("매개변수 둘");
	}

	

}
