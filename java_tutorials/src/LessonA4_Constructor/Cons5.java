package LessonA4_Constructor;

class parent3 {

	int kor;

	// 생성자 오버로딩
	parent3() {

	}

	parent3(int kor) {
		this.kor = kor;
		System.out.println(this.kor);
	}
}

// 클래스 상속
class daughter3 extends parent3 {

	int eng;

	// * 생성자 오버로딩
	// 매개변수 없는 생성자는 기본적으로 생략 가능하지만 (묵시적 생성자)
	// 매개변수 없는 생성자를 호출하기 위해서는 생성자를 반드시 명시해야 한다.
	daughter3() {
		super();
	}

	daughter3(int kor, int eng) {
		super(kor);
		this.eng = eng;
		System.out.println(this.eng);
	}
}

public class Cons5 {

	public static void main(String[] args) {

		parent3 p = new parent3();
		parent3 pp = new parent3(100);
		daughter3 d = new daughter3();
		daughter3 dd = new daughter3(99, 100);

	}
}
