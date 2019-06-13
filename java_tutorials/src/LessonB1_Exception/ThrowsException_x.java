package LessonB1_Exception;

public class ThrowsException_x {

	public void print() {

		try {
			int result = 100 / 0; // error
			System.out.println(result);
			
		} catch (ArithmeticException e) {
			System.out.println("cannot divide by 0");
			
		}

	}

}
