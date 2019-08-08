package LessonA4_Constructor;

// * ������(Constructor) : ��� Ŭ������ ��ü ������ ����Ǵ� �޼ҵ�
//   �� Ŭ���� ������ ���� ���� ������ ���� (������ ���� �ϳ���)
//   ������ ���� (��� ���� �����ڰ� �����) �� ������ ������ 
class parent2 {

	int kor;

	public void print() {
		System.out.println("parent");
	}

	parent2(int kor) {
		this.kor = kor;
	}
}

// Ŭ���� ���
class daughter2 extends parent2 {

	int eng;

	public void print2() {
		System.out.println("daughter");
	}

	// �ڽ� �����ڿ� �Ű������� �����Ѵٸ� ?
	daughter2(int kor, int eng) {
		
		super(kor);
		// �θ�Ŭ������ ������ ȣ�� (���⼭�� �θ� �����ڿ� �Ű������� �����ϹǷ� ���� �Բ� ȣ��)
		// ���� ù �ٿ��� ȣ�� ����
		
		this.eng = eng;

	}
}

// * public class�� �̸��� ���ϸ�� �����ؾ� �� *
//   main() �Լ��� public class ������ ����
public class Cons4 {

	public static void main(String[] args) {

		// ��ü ���� (Ŭ���� ����)
		// Ŭ���� ��� ���� ���, �θ� ������ ���� �� �ڽ� ������ ����
		daughter2 d = new daughter2(99, 100); // super(99);
		System.out.println(d.kor); // d.kor = 99
		d.print();
		System.out.println(d.eng);
		d.print2();
	}
}
