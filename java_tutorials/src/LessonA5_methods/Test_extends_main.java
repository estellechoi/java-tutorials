package LessonA5_methods;

public class Test_extends_main {

	public static void main(String[] args) {
		
		// �� Ŭ���� ���� �� �ʿ����� ���� Ŭ������ ������ �����ؾ���
		Test t1 =new Test();
		t1.aa();
		t1.bb();
		
		Test2 t2 = new Test2();
		t2.cc();
		
		// �� Ŭ���� ��� �� �ٸ� Ŭ���� extends �س���, �� Ŭ������ ������ �� �� ���� ��
		// * Rule : JAVA������ �� �ϳ��� Ŭ������ ��� ����
		Test3 t3 = new Test3();
		t3.aa();
		t3.bb();
		t3.dd();
		// t3.ee(); �� private class.
		
		// private ����� ��� ���� �� ����
		// �ٸ� ��Ű�� ���, default class�� ��� ���� �� ���� (protected�� ����?)
		
		
		

	}

}
