package LessonB7_Private;

import java.util.Date;

public class staticMethod {
	
	// �Ӽ� (property)
	static int kor = 100;
	static int eng = 90;
	int mat = 100;

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
		System.out.println(kor);
		System.out.println(eng);		
		// cannot make a static reference to the non-static field(mat).
		// System.out.println(mat);
		
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
