package LessonA4_Constructor;

// * 생성자(Constructor) : 모든 클래스의 객체 생성시 실행되는 메소드
//   한 클래스 내에는 여러 개의 생성자 존재 (실행은 오직 하나만)
//   생성자 생략 (기능 없는 생성자가 실행됨) → 묵시적 생성자 
class parent2 {

	int kor;

	public void print() {
		System.out.println("parent");
	}

	parent2(int kor) {
		this.kor = kor;
	}
}

// 클래스 상속
class daughter2 extends parent2 {

	int eng;

	public void print2() {
		System.out.println("daughter");
	}

	// 자식 생성자에 매개변수가 존재한다면 ?
	daughter2(int kor, int eng) {
		
		super(kor);
		// 부모클래스의 생성자 호출 (여기서는 부모 생상자에 매개변수가 존재하므로 값과 함께 호출)
		// 가장 첫 줄에만 호출 가능
		
		this.eng = eng;

	}
}

// * public class의 이름은 파일명과 동일해야 함 *
//   main() 함수는 public class 에서만 실행
public class Cons4 {

	public static void main(String[] args) {

		// 객체 생성 (클래스 복사)
		// 클래스 상속 중인 경우, 부모 생성자 실행 → 자식 생성자 실행
		daughter2 d = new daughter2(99, 100); // super(99);
		System.out.println(d.kor); // d.kor = 99
		d.print();
		System.out.println(d.eng);
		d.print2();
	}
}
