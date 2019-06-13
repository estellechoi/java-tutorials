package LessonA7_String;

public class IntegerClass {

	public static void main(String[] args) {
		
		Integer kor = 100;
		Integer eng = new Integer(90);
		
		int ko1 = kor.intValue();
		byte ko2 = kor.byteValue();
		short en1 = eng.shortValue();
		long en2 = eng.longValue();
		
		// ����  �� ����
		String str = kor.toString();
		
		// ����  �� ����
		String mat = new String("123");
		int m = Integer.parseInt(mat); // Class.method() �� static function
		
		
		// Ȯ��
		System.out.println(ko1);
		System.out.println(ko2);
		System.out.println(en1);
		System.out.println(en2);
		System.out.println(str);
		System.out.println(m-3);

	}

}
