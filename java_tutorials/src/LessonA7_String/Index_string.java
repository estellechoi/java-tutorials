package LessonA7_String;

public class Index_string {

	public static void main(String[] args) {

		String cell = "010-1234-5678";

		// 첫번째 -의 index → a = 3
		int a = cell.indexOf("-");
		
		// 마지막 -의 index → b = 8
		int b = cell.lastIndexOf("-");
		
		String fir = cell.substring(0,a); // 0 부터 a 전까지
		
		String sec = cell.substring(a+1,b); // a+1 부터 b 전까지
		
		String thr = cell.substring(b+1); // b+1 부터 끝까지
		
		System.out.println(fir+" "+sec+" "+thr);

	}

}
