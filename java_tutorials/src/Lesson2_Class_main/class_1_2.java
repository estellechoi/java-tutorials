package Lesson2_Class_main;

public class class_1_2 {

	public static void main(String[] args) {     // 실행함수인 main() 있다
		//  main() 내에서 객체 생성
		
		class_1_1 cc = new class_1_1(); // 내가 만들었던  클래스를(class_1_1) 호출 !! (new를 이용해서 복사, 본사본이름 cc)
		
		cc.input(); // cc의 함수 input(); 사용 ! // class_1_1에서 내가 정의했던 input();의 기능이 실행됨
		
		cc.cal(); // 출력 메소드 이용 : 함수 cal();
		
		System.out.println(cc.n1); // **부록** class_1_1 클래스에 포함된 변수 n1을 출력하자
		
		cc.n1=11;
		cc.n2=33;
		
		cc.cal();
		
		class_1_1 cc2= new class_1_1 (); // 객체지향 ↔ 절차지향 / 객체지향은 복사본끼리 독립적으로 실행됨
		cc2.input();

	}

}
