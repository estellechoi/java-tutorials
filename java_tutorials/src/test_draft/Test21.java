package test_draft;

public class Test21 {

	// 21. lotto��� �������̰� ũ�Ⱑ 6�� �迭�� ����� 
    // Math.random()�� �̿��Ͽ� 1~45������ ������ ���� �����ÿ�..
	
	int lotto[]= new int[6];
	
	public void random() {
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			
			for(int j=0; j<=i-1; j++) {
				if(lotto[j]==lotto[i])
					i=i-1;
			}
		}
	}
	
	public void print() {
		for(int i=0; i<lotto.length; i++)
			System.out.print(lotto[i]+" ");
	}
	
	
	
}
