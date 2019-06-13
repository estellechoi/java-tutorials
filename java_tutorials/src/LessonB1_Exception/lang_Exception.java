package LessonB1_Exception;

public class lang_Exception {

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

		} catch (Exception e) {
			// meet all kinds of exception for java beginners.
			// not recommended ¡ñ solve each exception as properly.
			System.out.println("Error.");
		}

		System.out.println("next.");

	}

}
