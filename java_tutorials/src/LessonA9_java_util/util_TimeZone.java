package LessonA9_java_util;
import java.util.TimeZone;
import java.util.Calendar;

public class util_TimeZone {

	public static void main(String[] args) {
		
		// LA의 시간을 알아보자.
		
		// TimeZone.getTimeZone("TimeZone.getAvailableIDs()[i]");

		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		
		Calendar today = Calendar.getInstance(tz);
		int ap = today.get(Calendar.AM_PM); // 오전 0 오후 1
		
		String apKor[] = {"오전", "오후"};
		
		System.out.println(apKor[ap]);
		
		

	}

}
