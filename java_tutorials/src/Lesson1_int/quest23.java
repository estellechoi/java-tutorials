package Lesson1_int;

public class quest23 {

	public static void main(String[] args) {
		// 23. pkc��� �������̰� ũ�Ⱑ 10�� �迭�� �����
	    // Math.random()�� �̿��Ͽ� 101~110������ ������ ���� �ְ� ��� �Ͻÿ�.
		
		int pkc [] = new int [10];
		
		for (int i=0; i<pkc.length; i++) {
			pkc[i] = (int)(Math.random()*10)+101;
			System.out.print(pkc[i]+" ");
		}
		

	}

}
