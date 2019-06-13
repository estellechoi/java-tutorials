package LessonA6_Interface;
// * what is the difference from abstract "class" ?
public interface Test1 { // 인터페이스 정의 → public static final 상수  + 추상메소드 (option: default/static)
	
	int kor = 100; // public static final 자동 부여 → 자동 final 처리되므로, 값이 없으면 에러
	public static final int eng = 100;
	
	void sum(); // public abstract method automatically.
	public abstract void print();

}
