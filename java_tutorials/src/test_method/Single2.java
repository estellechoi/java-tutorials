package test_method;

public class Single2 {

	String num; // 통장번호
	String pw; // 비밀번호
	int pay;
	
	private Single2(String num, String pw) {
		this.num=num;
		this.pw=pw; // 통장번호, 비번 체크 기능 있다고 가정
		this.pay=3000000;
	}
	
	public static Single2 getInstance() {
		Single2 s = new Single2("00-000-000-000","1234");
		return s; // 클래스 Single2를 복사한 객체 s
	}
	
	public void print() {
		System.out.println(pay);
	}
}
