package LessonA1_int;

public class quest22 {

	public static void main(String[] args) {
		// 22. test��� �������̰� ũ�Ⱑ 10�� �迭�� �����
	    // Math.random()�� �̿��Ͽ� 1~10������ ������ ���� �ְ� ����� �Ͻÿ�.
		
		int test[] = new int [10];
		
		for(int i=0; i<test.length; i++) {
			test[i]=(int)(Math.random()*10)+1;
		
			// �ߺ� ����
			
			for (int j=0; j<=i-1; j++) {
				if (test[j]==test[i])
					i=i-1;
			}
		}
			
		for(int i=0; i<test.length; i++) {
			System.out.print(test[i]+" ");
		}
		
		

	}

}
