package LessonB1_Exception;

public class ThrowsException {
	
	// indicate that a function throws its exception.
	// why ¡ñ working together every needs to know if thrown.
	public void print()  throws ArithmeticException {
		
		int result = 100/0; // error
		System.out.println(result);
		
	}

}
