package LessonB7_Private;

import java.util.Date;

public class staticMethod {

	// static method : �ܺ� Ŭ�������� ��ü���� ȣ�� ����
	// ȣ���� : Class.method();

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

// �ٸ� Ŭ����

class TestClass {

	Date today;

	public void testCall() {
		
		today = new Date();
		
		// static method ȣ�� (��ü���� X)
		staticMethod.getDate(today);
	}


}
