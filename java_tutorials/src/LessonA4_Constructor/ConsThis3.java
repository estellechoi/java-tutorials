package LessonA4_Constructor;

public class ConsThis3 {
	
	ConsThis3() {
		this(50,100);
		
		// this(50) �� ConsThis3(int a) ȣ��
		// this(50,100) �� ConsThis3(int a, int b) ȣ��
		
	}
	
	ConsThis3(int a) {
		System.out.println("�Ű����� �ϳ�");
	}
	
	ConsThis3(int a, int b) {
		System.out.println("�Ű����� ��");
	}

	

}
