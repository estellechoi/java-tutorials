package LessonB1_Exception;

public class MultiCatch {

	public static void main(String[] args) {

		int div;
		div = 0;

		try {
			// Exception 1
			String greet = "hi";
			greet = null;
			System.out.println(greet.toString());

			// Exception 2
			int lottery[] = new int[6];
			int a;
			a = 6;
			lottery[a] = 100;

			// Exception 3
			int result = 100 / div;
			System.out.println(result);

		} catch (NullPointerException e) {
			System.out.println("Null exists.");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Error.");

		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0.");

		} catch (Exception e) {
			// to solve unexpected exception.
			// should be the last catch statement.
			System.out.println("Unexpected error!");

		} finally {
			// 정확한 목적 ?
			// finally{} executes with or without exception.
			System.out.println("finally.");
		}

		System.out.println("next step.");

	}

}
