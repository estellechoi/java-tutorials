package test_array;

public class ConsOver {
	
	int kor;
	int eng;
	
	// *������ �����ε�*
	// �Ű������� ������ �ڷ����� ���� �����ڸ� ������ �����
	
	ConsOver() {
		this.kor=60;
		this.eng=60;
	}
	
	ConsOver(int kor) {
		this.kor=kor;
		this.eng=60;
	}
	
	ConsOver(int kor, int eng) {
		this.kor=kor;
		this.eng=eng;
	}
	
	/*
	 
	 �� �Ű����� 1������ ���� �����ڰ� �̹� �����ϹǷ� ����!
	   ���� �ڷ��� �Ű������� ������ ������ ������ �ߺ� ��� �Ұ�
	
	*/
	
	ConsOver(double eng) { // int �ڷ��� ���� ���� !
		this.kor=60;
		this.eng=(int)eng; // double ���� int�� ��ȯ�ؾ� this.eng�� ���尡��
	}
	
	
	public void print() {
		System.out.println(kor+eng);
	}
	

}
