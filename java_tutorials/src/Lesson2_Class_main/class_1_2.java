package Lesson2_Class_main;

public class class_1_2 {

	public static void main(String[] args) {     // �����Լ��� main() �ִ�
		//  main() ������ ��ü ����
		
		class_1_1 cc = new class_1_1(); // ���� �������  Ŭ������(class_1_1) ȣ�� !! (new�� �̿��ؼ� ����, ���纻�̸� cc)
		
		cc.input(); // cc�� �Լ� input(); ��� ! // class_1_1���� ���� �����ߴ� input();�� ����� �����
		
		cc.cal(); // ��� �޼ҵ� �̿� : �Լ� cal();
		
		System.out.println(cc.n1); // **�η�** class_1_1 Ŭ������ ���Ե� ���� n1�� �������
		
		cc.n1=11;
		cc.n2=33;
		
		cc.cal();
		
		class_1_1 cc2= new class_1_1 (); // ��ü���� �� �������� / ��ü������ ���纻���� ���������� �����
		cc2.input();

	}

}
