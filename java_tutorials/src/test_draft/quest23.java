package test_draft;

public class quest23 {

		// 23. pkc��� �������̰� ũ�Ⱑ 10�� �迭�� �����
	    // Math.random()�� �̿��Ͽ� 101~110������ ������ ���� �ְ� ��� �Ͻÿ�.
	
	int pkc[] = new int[10];
	
	public void random() {
		for(int i=0; i<pkc.length; i++) {
			pkc[i]=(int)(Math.random()*10)+101;
		}
	}
	
	public void print() {
		for(int i=0; i<pkc.length; i++)
			System.out.print(pkc[i]+" ");
	}


}
