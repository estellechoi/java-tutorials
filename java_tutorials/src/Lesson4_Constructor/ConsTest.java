package Lesson4_Constructor;

public class ConsTest {
	
	// �����ڸ� ���� a~b ���� ���Ͻÿ�. ������(a,b)
	
	int a;
	int b;
	int sum;
	
	ConsTest(int a, int b) {
		for(int i=a; i<=b; i++)
			sum=sum+i;
		
		print();
	}
	
	// ��� �Լ� (��������)
	public void print() {
		System.out.println(sum);
	}
	
	// �޼ҵ� �̿�
	public void cal(int a, int b) {
		
		int sum=0; // �������� sum ���� ���� �������� ..?
		
		for(int i=a; i<=b; i++)
			sum=sum+i;
	
		System.out.println(sum);      // �������� sum
		System.out.println(this.sum); // �������� sum
		print();
	}

	
	
	
	
}
