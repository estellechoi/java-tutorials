package LessonB1_Exception;

public class lang_ArithmeticException {

	public static void main(String[] args) {

		// ArithmeticException

		// int a = 10 / 0; // 0���� ���ڸ� ���� �� ���� !

		int d;
		d = 0;

		// * Old try to prevent exception error.
		// d = 0 �� �ƴ� ���� ����
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
