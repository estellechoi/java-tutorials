package Lesson3_return;

public class Test_all2 {

	public static void main(String[] args) {
		// 6. ���� ������ Scanner�� �Է¹��� ��, 60�� �̻��̸� "�հ�"�� ����ϰ� 60�� �̸��̸� "���հ�" ����Ͻÿ�.
		
		Test6 t6 = new Test6();
		
		t6.input();
		t6.print();
		
		// 7. ��,��,���� ������ Scanner�� �Է¹��� �� ���ο� ���ð��� 1,2,3 �߿� �ϳ��� �Է¹޾Ƽ�
		// 1�� �ԷµǸ� ���������� ��� 2�� �Է¹����� ���������� ���, 3�� �Է¹����� ���� ������ ����Ͻÿ�.
		
		Test7 t7 = new Test7();
		
		t7.input();
		t7.print();
		
		// 8. 7�� �������� �� ���� ������� ��,��,��,��,���� ����Ͻÿ�.
		
		Test8 t8 = new Test8();
		t8.input();
		t8.result();
		t8.print();
		
		// 8 �Ű����� Ȱ��.
		
		Test8_r tr = new Test8_r();
		
		tr.input();
		tr.print();
		
		//
		
		tr.result(70,"score: 70/ ");
		tr.result(tr.eng,"eng: ");
	

	}

}
