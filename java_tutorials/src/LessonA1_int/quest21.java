package LessonA1_int;

public class quest21 {

	public static void main(String[] args) {
		// 21. lotto��� �������̰� ũ�Ⱑ 6�� �迭�� ����� 
	    // Math.random()�� �̿��Ͽ� 1~45������ ������ ���� �����ÿ�.
		
		int lotto[] = new int [6];
		
		for (int i=0; i<lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45)+1;
		}

	}

}
