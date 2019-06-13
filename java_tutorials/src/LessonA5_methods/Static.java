package LessonA5_methods;

public class Static {
	
	int kor;
	static String name;
	static int age;
	
	public void print() {
		System.out.println(kor);
	}
	
	public void input(int kor) {
		this.kor=kor;
		age=11; // static 변수 사용 가능
	}

	// static member (정적 멤버) → 객체 생성하지 말고 써라 !
	
	public static void aa(String x) {
		System.out.println(name+" "+age+" "+x);
		// ⓐ this.age=25; 못 쓴다. this는 클래스 자신이므로 static이 아님.
		// ⓑ kor=100; 못 쓴다 . kor은 static 속성이 아님.
		
		// * 단점 : 캡슐화 불가능 (클래스 내용 못 숨겨 ...)
	}
}
