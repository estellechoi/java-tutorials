package Lesson1_int;

public class quest15 {

	public static void main(String[] args) {
		// 1���� 100������ (4�� ����� ��)-(6�� �������) �� ���Ͻÿ�.
		
		int n4=0;
		
		for(int i=1; i<=100; i++) {
			if(i%4==0)
			n4=n4+i;
		}
		
		int n6=0;
		
		for(int i=1; i<=100; i++) {
			if(i%6==0)
				n6=n6+i;
		}
		
		System.out.print(n4-n6);

	}

}
