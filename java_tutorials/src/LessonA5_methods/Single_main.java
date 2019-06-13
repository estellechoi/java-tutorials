package LessonA5_methods;

public class Single_main {
	
	public static void main(String[] args) {
		
		// Single s = new Single("youjin");
		// 매개변수 통해서 클래스 복사하면서 name 초기값 생김
		// private 생성자이므로, 객체 s 생성 불가
		// s.input(20, 7);
		// s.cal();
		
		Single s = Single.getInstance();
		// static 참조할 때 class.member;
		// return s → Single s
		// 객체 생성 X → 복사해오는 것 X (참조 하는 것 ! 조회만 하는 개념 .. ㅎ)
		
		s.input(20, 7);
		s.cal();
		
	}

}
