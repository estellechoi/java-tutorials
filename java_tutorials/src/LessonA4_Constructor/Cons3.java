package LessonA4_Constructor;

// * ������(Constructor) : ��� Ŭ������ ��ü ������ ����Ǵ� �޼ҵ�
//   �� Ŭ���� ������ ���� ���� ������ ���� (������ ���� �ϳ���)
//   ������ ���� (��� ���� �����ڰ� �����) �� ������ ������ 
class parent {

	int kor = 90;

	public void print() {
		System.out.println("parent");
	}
}

// Ŭ���� ���
class daughter extends parent {

	int eng = 100;

	public void print2() {
		System.out.println("daughter");
	}
	
	daughter() {
		
		super();
		// �θ�Ŭ������ ������ ȣ�� (���⼭�� ������ ������)
		// ���� ù �ٿ��� ȣ�� ���� (�θ� �����ڴ� �׻� �ڽ� �����ں��� ���� ����Ǿ�� ��)
		
		System.out.println("daughter ������");
	}
}

// * public class�� �̸��� ���ϸ�� �����ؾ� �� *
//   main() �Լ��� public class ������ ����
public class Cons3 {

	public static void main(String[] args) {

		// ��ü ���� (Ŭ���� ����)
		// Ŭ���� ��� ���� ���, �θ� ������ ���� �� �ڽ� ������ ����
		daughter d = new daughter();
		System.out.println(d.kor);
		d.print();
		System.out.println(d.eng);
		d.print2();
	}
}
