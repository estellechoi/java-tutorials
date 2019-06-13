package LessonB1_Exception;

public class lang_NullPointerException {

	public static void main(String[] args) {

		// 런타임예외 NullPointerException

		String str = "hi";
		str = null;

		// System.out.println(str); // this works without error. but why ?
		// System.out.println(str.toString()); // this doesn't work.

		// * Proper way
		// try{} catch(NullPointerException x){}

		try {
			String greet = "hi";
			greet = null;
			System.out.println(greet.toString());

		} catch (NullPointerException e) {
			// 예외 발생시 실행할 내용
			// e.getMessage();
			// e.printStackTrace();
			System.out.println("null exists.");
		}

		System.out.println("next.");

	}
}
