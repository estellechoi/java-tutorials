package LessonB1_Exception;

public class lang_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {

		// 런타임 예외

		int lotto[] = new int[6]; // index : 0 ~ 5
		// lotto[6] = 100;
		// 범위에 없는 index 6 → 에러

		// * Old try to prevent exception error.
		int n;
		n = 6; // 사용자 입력 값이라고 가정
		if (n >= 0 && n <= 5) {
			lotto[n] = 100;
		}

		// * Proper way : try{} catch(){}

		try {
			int lottery[] = new int[6];
			int a;
			a = 6;
			lottery[a] = 100;

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("next.");

	}

}
