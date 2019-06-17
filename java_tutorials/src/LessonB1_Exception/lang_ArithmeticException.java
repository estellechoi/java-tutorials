package LessonB1_Exception;

public class lang_ArithmeticException {

	public static void main(String[] args) {

		// ArithmeticException

		// int a = 10 / 0; // 0으로 숫자를 나눌 수 없다 !

		int d;
		d = 0;

		// * Old try to prevent exception error.
		// d = 0 이 아닐 때만 실행
		if (d != 0) {
			int result = 10 / d;
		}
		System.out.println("Next statement.");

		// * Proper way : try{} catch(){}

		int div;
		div = 0;

		try {
			int result = 100 / div;
			System.out.println(result);

		} catch (ArithmeticException e) {
			System.out.println(e.getStackTrace());
		}


	}

}
