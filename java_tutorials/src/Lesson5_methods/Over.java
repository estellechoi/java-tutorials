package Lesson5_methods;

public class Over {

	// �Էµ� ���� ��� ���ϱ�
	// Method overloading (�Ű������� ������ �ٸ���, �̸� ���� �Լ� ���� �� ���� ����)
	
	public void avg(int a, int b) {
		
		int avg = (a+b)/2;
		System.out.println(avg);
	}
	
	public void avg(int a, int b, int c) {
		int avg=(a+b+c)/3;
		System.out.println(avg);
	}
	
	public void avg(int a, int b, int c, int d) {
		int avg=(a+b+c+d)/4;
		System.out.println(avg);
	}
	
	public void avg(int a, int b, int c, int d, int e) {
		int avg=(a+b+c+d+e)/5;
		System.out.println(avg);
	}
	
	

}
