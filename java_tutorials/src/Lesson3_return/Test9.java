package Lesson3_return;

public class Test9 {

	// 9.  num1=99,  num2=88 �̶�� ���ڰ� ����Ǿ� �ִٰ� �Ҷ� �κ����� ���� ��ȯ�Ͻÿ�.
	//	( num1=88 , num2=99)
	
	int num1=99;
	int num2=88;
	int x;
	
	public void exchange() {
		x=num1;
		num1=num2;
		num2=x;
	}
	
	public void print() {
		System.out.print(num1+" "+num2);
	}
}
