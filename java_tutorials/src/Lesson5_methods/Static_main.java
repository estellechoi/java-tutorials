package Lesson5_methods;

public class Static_main {

	public static void main(String[] args) {
		
		// * Instance Member
		// 속성과 메소드 쓰려면 객체 생성 필요
		Static i = new Static();
		i.input(100);
		i.print();
		
		// * Static Member(정적 멤버)
		// 객체 생성하지 않고 클래스로 바로 접속 → 메모리 절약도 됨 ㅎ
		// main(){}; JRE(자바가상머신)에서 실행시킴
		
		// * 사용법 : class.variable= value;
		Static.name = "youjin";
		Static.age = 27;
		Static.aa("!");

	}

}
