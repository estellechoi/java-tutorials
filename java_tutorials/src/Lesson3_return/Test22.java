package Lesson3_return;

public class Test22 {

	// 22. test��� �������̰� ũ�Ⱑ 10�� �迭�� �����
    // Math.random()�� �̿��Ͽ� 1~10������ ������ ���� �ְ� ����� �Ͻÿ�..
	
	int test[]= new int[10];
	
	public void random() {
		for(int i=0; i<test.length; i++) {
			test[i]=(int)(Math.random()*10)+1;
			for(int j=0; j<=i-1; j++) {
				if(test[j]==test[i])
					i=i-1;
			}
		}
	}
	
	public void blank() {
		System.out.println(" ");
	}
	
	public void print() {
		for(int i=0; i<test.length; i++)
			System.out.print(test[i]+" ");
	}
	
	
	
}

