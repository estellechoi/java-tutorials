package test_method;

public class Single2 {

	String num; // �����ȣ
	String pw; // ��й�ȣ
	int pay;
	
	private Single2(String num, String pw) {
		this.num=num;
		this.pw=pw; // �����ȣ, ��� üũ ��� �ִٰ� ����
		this.pay=3000000;
	}
	
	public static Single2 getInstance() {
		Single2 s = new Single2("00-000-000-000","1234");
		return s; // Ŭ���� Single2�� ������ ��ü s
	}
	
	public void print() {
		System.out.println(pay);
	}
}
