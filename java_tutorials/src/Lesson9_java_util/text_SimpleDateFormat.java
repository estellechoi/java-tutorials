package Lesson9_java_util;
import java.util.Date;
import java.text.SimpleDateFormat;

public class text_SimpleDateFormat {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		// Date Format 컨트롤
		// E : 일/월/화/수/목/금/토
		// a : 오전/오후
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dayBar = sdf.format(today);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String dayKor = sdf.format(today);
		
		sdf = new SimpleDateFormat("a HH:mm:ss");
		String time = sdf.format(today);
		
		System.out.println(dayBar);
		System.out.println(dayKor);
		System.out.println(time);
		
		sdf = new SimpleDateFormat("오늘은 yyyy년 MM월 dd일 E요일입니다.");
		String greet = sdf.format(today);
		
		System.out.println(greet);

	}

}
