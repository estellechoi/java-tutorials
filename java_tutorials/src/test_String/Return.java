package test_String;
import java.util.Date;

public class Return {
	
	// return function �� void ��� �ڷ���
	public int aaa() {
		int a=9;
		return a;
	}
	
	public int[] bbb() {
		int kor[] = new int[3];
		kor[0]= 100;
		kor[1]= 150;
		kor[2]= 110;
		return kor;
		
	}
	
	// �ڷ����� Date(class) �� ���
	// ��ü������ return�ؼ� �� �� ���� ! (Date today)
	public Date ccc() {
			Date today = new Date();
			return today;
	}

}