package LessonB7_Private;

public class staticMethod_main {

	public static void main(String[] args) {
		
		// call static method
		int kor = 100;
		staticMethod.cal(kor);
		
		// cannot call non-static one unless creating an object.
		staticMethod.print();

	}

}
