package LessonA4_Constructor;

// * ������(Constructor) : ��� Ŭ������ ��ü ������ ����Ǵ� �޼ҵ�
//   �� Ŭ���� ������ ���� ���� ������ ���� (������ ���� �ϳ���)
//   ������ ���� (��� ���� �����ڰ� �����) �� ������ ������ 
public class Cons3 {

	int kor = 100;

	public void print() {
		System.out.println("Cons3");
	}
}

// Ŭ���� ���
class daughter extends Cons3 {

	int eng = 100;

	public void print2() {
		System.out.println("daughter");
	}
	
	daughter() {
		super(); // �θ�Ŭ������ ������ ���� �����Ű��
	}
}

// ���� Ŭ����
class son {

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
