package LessonB1_Exception;

public class lang_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {

		// ��Ÿ�� ����

		int lotto[] = new int[6]; // index : 0 ~ 5
		// lotto[6] = 100;
		// ������ ���� index 6 �� ����

		// * Old try to prevent exception error.
		int n;
		n = 6; // ����� �Է� ���̶�� ����
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
