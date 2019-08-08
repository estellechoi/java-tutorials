package LessonA4_Constructor;

// * 생성자(Constructor) : 모든 클래스의 객체 생성시 실행되는 메소드
//   한 클래스 내에는 여러 개의 생성자 존재 (실행은 오직 하나만)
//   생성자 생략 (기능 없는 생성자가 실행됨) → 묵시적 생성자 
class parent {

	int kor = 100;

	public void print() {
		System.out.println("parent");
	}
}

// 클래스 상속
class daughter extends parent {

	int eng = 100;

	public void print2() {
		System.out.println("daughter");
	}
	
	daughter() {
		
		super();
		// 부모클래스의 생성자 호출 (여기서는 묵시적 생성자)
		// 가장 첫 줄에만 호출 가능 (부모 생성자는 항상 자식 생성자보다 먼저 실행되어야 함)
		
		System.out.println("daughter 생성자");
	}
}

// 실행 클래스
// * public class의 이름은 파일명과 동일해야 함 *
public class Cons3 {

	public static void main(String[] args) {

		// 객체 생성 (클래스 복사)
		// 클래스 상속 중인 경우, 부모 생성자 실행 → 자식 생성자 실행
		daughter d = new daughter();
		System.out.println(d.kor);
		d.print();
		System.out.println(d.eng);
		d.print2();
	}
}
