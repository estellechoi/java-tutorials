package LessonA7_String;

public class Index_string {

	public static void main(String[] args) {

		String cell = "010-1234-5678";

		// ù��° -�� index �� a = 3
		int a = cell.indexOf("-");
		
		// ������ -�� index �� b = 8
		int b = cell.lastIndexOf("-");
		
		String fir = cell.substring(0,a); // 0 ���� a ������
		
		String sec = cell.substring(a+1,b); // a+1 ���� b ������
		
		String thr = cell.substring(b+1); // b+1 ���� ������
		
		System.out.println(fir+" "+sec+" "+thr);

	}

}
