package LessonA4_Constructor;

public class Cons {
	
	int kor;
	int eng;
	int mat;
	
	// ������ �Լ� �� Ŭ�����̸�() {}
	// ��main���� ��ü ���� �� �����ش�  ��main���� �߻��� �� ����� ��  ��class ��ӹ��� �� ?
	Cons(int k, int e, int m) {
		kor=k;
		eng=e;
		mat=m;
	}
	
	// �޼ҵ�
	public void print() {
		int sum=kor+eng+mat;
		System.out.println(sum);
	}

}
