package LessonA4_Constructor;

class parent3 {

	int kor;

	// ������ �����ε�
	parent3() {

	}

	parent3(int kor) {
		this.kor = kor;
		System.out.println(this.kor);
	}
}

// Ŭ���� ���
class daughter3 extends parent3 {

	int eng;

	// * ������ �����ε�
	// �Ű����� ���� �����ڴ� �⺻������ ���� ���������� (������ ������)
	// �Ű����� ���� �����ڸ� ȣ���ϱ� ���ؼ��� �����ڸ� �ݵ�� ����ؾ� �Ѵ�.
	daughter3() {
		super();
	}

	daughter3(int kor, int eng) {
		super(kor);
		this.eng = eng;
		System.out.println(this.eng);
	}
}

public class Cons5 {

	public static void main(String[] args) {

		parent3 p = new parent3();
		parent3 pp = new parent3(100);
		daughter3 d = new daughter3();
		daughter3 dd = new daughter3(99, 100);

	}
}
