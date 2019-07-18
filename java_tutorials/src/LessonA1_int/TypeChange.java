package LessonA1_int;

public class TypeChange {

	public static void main(String[] args) {
		
		int a = 1000; // 4byte
		byte b = 99; // 1byte
		long c = 1389234343; // 8byte

		// 자료형 : byte, short, int, long
		// 클래스 : Byte, Short, Integer, Long -> .parseByte(); .parseShort(); ...
		
		// 문자 → 숫자
		String N = "1234567";
		int n = Integer.parseInt(N);
		Integer m = Integer.parseInt(N);
		
		// 숫자 → 문자
		String reN = n+"";
		String reM = m.toString();
		
		

	}

}
