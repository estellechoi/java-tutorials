package Lesson4_Constructor;

public class ConsThis {
	
	int kor=99; // ��������
	
	public void print() {
		
		int kor=88; // ��������
		
		System.out.println(kor);
		System.out.println(this.kor); // this �� Ŭ���� ConsThis
		
		// ���� �̸��� ���� ��, �ڹ������Ϸ��� ���� ����� �������� ���� ã�� ������
		// ��������(�ٱ�)�� �ʿ��� �� (this.����) �ҷ������.
	}
	
	public void printa() {
		System.out.println(kor);
	}
	

}
