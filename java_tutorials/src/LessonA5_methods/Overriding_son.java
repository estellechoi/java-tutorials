package LessonA5_methods;
/* 
$ �����ε� : ���� �̸��� �޼ҵ�/�����ڸ� ���� �� �����鼭 ���� ��/�ڷ����� �ٸ��� ��
         �� �޼ҵ� �����ε�, ������ �����ε�
$ �������̵� : ���� Ŭ������ �޼ҵ�� �̸��� ���(signature)�� ���� �Լ��� ���� Ŭ�������� ������
*/

public class Overriding_son extends Overriding {
	
	public void aa() {
		System.out.println("what");
	}
	
	// Overriding �������̵�
	public void print() {
		System.out.println("hey ?");
	}
	
	// Overloading �����ε�
	public void print(int a) {
		System.out.println(a);
		
	}
}


