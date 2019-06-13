package LessonA9_java_util;
import java.util.Calendar;

public class util_Calendar {

	public static void main(String[] args) {
		
		// ⓐ Date today = new Date(); (객체 생성)
		
		// ⓑ Calendar today = Calendar.getInstance(); (참조)
		
		// * Cannot instantiate automatically. 객체생성 불가
		// ∵ the constructor Calendar is private. (singleton)
		//    public static Calendar getInstance(){} 객체생성 없이 참조
		
		Calendar today = Calendar.getInstance();
		int ap = today.get(Calendar.AM_PM); // 오전 0 오후 1
		System.out.println(ap);
		
		// today.get(int field);
		int y = today.get(Calendar.YEAR);
		int m = today.get(Calendar.MONTH)+1;
		int d = today.get(Calendar.DAY_OF_MONTH);
		
		int day = today.get(Calendar.DAY_OF_WEEK);
		// 일 : 1 ~ 토 : 7 
		
		int hh = today.get(Calendar.HOUR);
		int mm = today.get(Calendar.MINUTE);
		int ss = today.get(Calendar.SECOND);
		
		System.out.println(y+ " 년 "+m+" 월 "+d+" 일");
		System.out.println(day + " 요일");
		System.out.println(hh+" 시 "+mm+" 분 "+ss+" 초");

		// System.out.println(today.toString());

	}

}
