package LessonA4_Constructor;

public class Cons {
	
	int kor;
	int eng;
	int mat;
	
	// 생성자 함수 → 클래스이름() {}
	// ①main에서 객체 만들 때 값을준다  ②main에서 발생한 값 사용할 때  ③class 상속받을 때 ?
	Cons(int k, int e, int m) {
		kor=k;
		eng=e;
		mat=m;
	}
	
	// 메소드
	public void print() {
		int sum=kor+eng+mat;
		System.out.println(sum);
	}

}
