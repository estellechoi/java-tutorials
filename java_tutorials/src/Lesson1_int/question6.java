package Lesson1_int;

public class question6 {

	public static void main(String[] args) {

		//6. 1���� 100������ ������ 3�� ����� �ƴѰ��� ���� ����Ͻÿ�.

		
		int n = 0;
		
		
			for (int i=1;i<=100;i++) {
				if(i%3 != 0) {
					n=n+i;           
				}
			}

		System.out.println(n);


	}

}
