package LessonA9_java_util;
import java.util.Date;

public class util_Date {

	public static void main(String[] args) {
		
		// Date()
		Date today = new Date();
		
		int y = today.getYear()+1900; // getFullYear() 안되네 ..
		int m = today.getMonth()+1;
		int d = today.getDate();
		int day = today.getDay();
		int hh = today.getHours();
		int mm = today.getMinutes();
		int ss = today.getSeconds();
		
		String date = y+" 년 "+m+" 월 "+d+" 일 ";
		String daystr = day + " 요일";
		String time = hh+" 시  "+mm+" 분 "+ss+" 초 ";
		
		System.out.println(date);
		System.out.println(daystr);
		System.out.println(time);

		
		// toString(); 객체변수를 문자열로 변환
		// 자동상속 (모든 객체에서 사용 가능)
		System.out.println(today.toString());

	}

}
