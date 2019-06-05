package Lesson5_methods;

public class Abstract_main {

	public static void main(String[] args) {
		
		// Abstract ab = new Abstract(); // → 객체 생성 자체가 불가
		
		Abstract_son ab = new Abstract_son();
		
		ab.input(); // overridden method in son class.
		ab.print(); // an original method of father class(abstract)

	}

}
