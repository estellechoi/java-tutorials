package LessonB7_Private;

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

}
