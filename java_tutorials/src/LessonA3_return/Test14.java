package LessonA3_return;

public class Test14 {

	// 14. 1���� 100������ 8�� ����� ���� ����Ͻÿ�..
	
	int n=0;
	
	public void plus() {
		for(int i=0; i<=100; i++) {
			if(i%8==0)
				n=n+i;
		}
	}
	
	public void print() {
		System.out.println(n);
	}

}
