package LessonA1_int;

public class TypeChange {

	public static void main(String[] args) {
		
		int a = 1000; // 4byte
		byte b = 99; // 1byte
		long c = 1389234343; // 8byte

		// �ڷ��� : byte, short, int, long
		// Ŭ���� : Byte, Short, Integer, Long -> .parseByte(); .parseShort(); ...
		
		// ���� �� ����
		String N = "1234567";
		int n = Integer.parseInt(N);
		Integer m = Integer.parseInt(N);
		
		// ���� �� ����
		String reN = n+"";
		String reM = m.toString();
		
		

	}

}
