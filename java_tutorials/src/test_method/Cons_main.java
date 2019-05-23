package test_method;

public class Cons_main {
	public static void main(String[] args) {
	
		// 객체 생성 (인스턴스화)
		// *** 자식 생성자 실행시 부모 생성자도 무조건 함께 실행
		// *** 실행 순서 : 부모 생성자  → 자식 생성자
		Cons co = new Cons();
		co.aa();
		co.bb();
		
		// 부모 생성자의 매개변수에 ? 값을 어떻게 주나 ? 주기 전에 자동실행인데 ?
	}

}
