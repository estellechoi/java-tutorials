package Lesson3_return;

public class Test20 {

	// 20. pay��� �迭�� {100,200,150,55,88,95,56,96,88}�� ���� �Է��ϰ�
	// ������ ���ؼ� ����Ͻÿ�..
	
	int pay[] = {100,200,150,55,88,95,56,96,88};
	int sum=0;
	
	public void sum() {
		for(int i=0; i<pay.length; i++) {
			sum=sum+pay[i];
		}
	}
	
	public void print() {
		System.out.println(sum);
	}

}
