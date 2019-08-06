package LessonB7_Private;

import java.util.Date;

public class staticMethod {
	
	// 속성 (property)
	static int kor = 100;
	static int eng = 90;
	int mat = 100;

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
		System.out.println(kor);
		System.out.println(eng);		
		// cannot make a static reference to the non-static field(mat).
		// System.out.println(mat);
		
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
