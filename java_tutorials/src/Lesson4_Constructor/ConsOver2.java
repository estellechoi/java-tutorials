package Lesson4_Constructor;

public class ConsOver2 {
	
	int sum;

	// *�����ε� �� ���
	// �Ű����� ���� ������ �ڵ��������� ����
	// �� ConsOver2(){} is not created automatically.
	ConsOver2() {
		for(int i=0; i<=100; i++)
			sum=sum+i;
	}
	
	
	ConsOver2(int a) {
		for(int i=0; i<=a; i++)
			sum=sum+i;
	}
	
	ConsOver2(int a, int b) {
		for(int i=a; i<=b; i++)
			sum=sum+i;
	}
	
	// method
	public void print() {
		System.out.println(sum);
	}
	
	

}
