package LessonA5_methods;

public class Test_extends_main {

	public static void main(String[] args) {
		
		// ⓐ 클래스 복사 → 필요기능을 가진 클래스를 일일이 복사해야함
		Test t1 =new Test();
		t1.aa();
		t1.bb();
		
		Test2 t2 = new Test2();
		t2.cc();
		
		// ⓑ 클래스 상속 → 다른 클래스 extends 해놓고, 한 클래스만 복사한 후 다 갖다 씀
		// * Rule : JAVA에서는 단 하나의 클래스만 상속 가능
		Test3 t3 = new Test3();
		t3.aa();
		t3.bb();
		t3.dd();
		// t3.ee(); → private class.
		
		// private 멤버는 상속 받을 수 없음
		// 다른 패키지 라면, default class는 상속 받을 수 없음 (protected는 가능?)
		
		
		

	}

}
