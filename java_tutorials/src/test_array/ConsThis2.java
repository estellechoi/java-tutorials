package test_array;

public class ConsThis2 {

	int kor;
	int eng;
	int mat;
	
	ConsThis2(int kor, int eng, int mat) {
		this.kor=kor;   // �������� this.kor = �������� kor;
		eng=eng;		// ���⼭ eng ����ϸ� ���������̱� ���������� ���� �Ȱ���!
		this.mat=mat;
	}

	public void print() {
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
	}

}
