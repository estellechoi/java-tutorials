package LessonA4_Constructor;

class grandparent {

	int kor;

	grandparent() {
		System.out.println("조상생성자");
	}
}

class parent4 extends grandparent {

	int eng;

	parent4() {
		System.out.println("부모생성자");
	}
}

class daughter4 extends parent4 {

	int mat;

	daughter4() {
		System.out.println("자식생성자");
	}

	public void input() {
		kor = 90;
		eng = 100;
		mat = 100;
	}

	public void print() {
		System.out.println(kor + eng + mat);
	}
}

public class Cons6 {

	public static void main(String[] args) {

		daughter4 d = new daughter4();
		// 조상 → 부모 → 자식 생성자 순으로 실행
		
	}

}
