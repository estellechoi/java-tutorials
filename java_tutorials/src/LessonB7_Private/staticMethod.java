package LessonB7_Private;

import java.util.Date;

public class staticMethod {

	// static method : 외부 클래스에서 객체없이 호출 가능
	// 호출방법 : Class.method();

	public static void cal(int kor) {
		kor++;
		System.out.println(kor);
	}

	
	// non-static

	public void print() {
		System.out.println("test");
	}

	
	// static method
	
	public static void getDate(Date today) {
		System.out.println(today.getMonth());
	}

}

// 다른 클래스

class TestClass {

	Date today;

	public void testCall() {
		
		today = new Date();
		
		// static method 호출 (객체생성 X)
		staticMethod.getDate(today);
	}


}
