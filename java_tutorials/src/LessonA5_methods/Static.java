package LessonA5_methods;

public class Static {
	
	int kor;
	static String name;
	static int age;
	
	public void print() {
		System.out.println(kor);
	}
	
	public void input(int kor) {
		this.kor=kor;
		age=11; // static ���� ��� ����
	}

	// static member (���� ���) �� ��ü �������� ���� ��� !
	
	public static void aa(String x) {
		System.out.println(name+" "+age+" "+x);
		// �� this.age=25; �� ����. this�� Ŭ���� �ڽ��̹Ƿ� static�� �ƴ�.
		// �� kor=100; �� ���� . kor�� static �Ӽ��� �ƴ�.
		
		// * ���� : ĸ��ȭ �Ұ��� (Ŭ���� ���� �� ���� ...)
	}
}
