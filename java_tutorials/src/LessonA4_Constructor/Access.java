package LessonA4_Constructor;

public class Access {  // public class : 아무나 보세요 (캡슐화 X)
	
	private int kor;  // 내 클래스 안에서만 (캡슐화)
	private int eng;
	
	public void print() { // public 함수 : 아무나 쓰세요 ㅎ
		
		kor=100;
		System.out.println(kor);
	}
	
	// public, private (해당 클래스 안에서만), protected (패키지 안에서만)
	// default (접근권한 안적은거 ..)

}
