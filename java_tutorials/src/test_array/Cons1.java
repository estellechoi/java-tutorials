package test_array;

public class Cons1 {

	// �Ӽ� : ����
	int n;
	int total;
	
	// ������ : ���
	// Ŭ���� ���� �Ӽ��� �ʱⰪ�� �ִ� ��
	Cons1() {
		n=88;
	}
	
	// �޼ҵ� : ���
	public void input() {
		n=99;
	}
	
	public void cal() {
		for(int i=0; i<=n; i++)
			total=total+i;
	}
	
	public void print() {
		System.out.println(total);
	}
}
