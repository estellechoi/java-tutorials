package LessonA4_Constructor;

public class Cons1_main {

	public static void main(String[] args) {
	
		// �� main �Լ� ������ ������ ���� ����
		Cons1 c1 = new Cons1();
		c1.n =100;
		c1.cal();
		c1.print();
		
		// �� �޼ҵ带 �̿�
		
		Cons1 c2 = new Cons1();
		c2.input();
		c2.cal();
		c2.print();
		
		// �� �����ڸ� �̿� (������ �� �ʱⰪ)
		
		Cons1 c3 = new Cons1();
		c3.cal();
		c3.print();
		
		

	}

}
