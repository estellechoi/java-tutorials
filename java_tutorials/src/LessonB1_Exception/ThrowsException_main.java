package LessonB1_Exception;

public class ThrowsException_main {

	public static void main(String[] args) {

		ThrowsException th = new ThrowsException();

		try {
			th.print();

		} catch (ArithmeticException e) {
			System.out.println("cannot divide by 0.");
		}

		System.out.println("finished.");

	}

}
