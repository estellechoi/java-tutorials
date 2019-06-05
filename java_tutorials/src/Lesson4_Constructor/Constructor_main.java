package Lesson4_Constructor;

public class Constructor_main {

	public static void main(String[] args) {
		
		Constructor con = new Constructor(); // 객체 생성
		
		// 싱글톤 ..? ㅠㅠㅠ
		// Constructor c = Constructor.aa(); // -> 다른 클래스에서 이미 new 선언
		
		con.kor=99;
		con.aa();
		
		Constructor.eng=90; // 객체생성 X  클래스.static변수;
		// 중요한 데이터는 절대 static X -> 객체 생성없이 마구마구 사용되므로 ..!

		
		

	}

}
