package test_fir;

public class quest20 {

	public static void main(String[] args) {
		// 20. pay��� �迭�� {100,200,150,55,88,95,56,96,88}�� ���� �Է��ϰ�
		// ������ ���ؼ� ����Ͻÿ�.
		
		int pay[] = {100,200,150,55,88,95,56,96,88};
		
		int sum=0;
		
		for (int i=0; i<pay.length; i++) {
			sum= sum+ pay[i];
		}
		
		System.out.print(sum);
		

	}

}
