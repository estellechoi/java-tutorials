package LessonA9_java_util;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class time_temporal_ChronoUnit {

	public static void main(String[] args) {
		
		LocalDateTime today = LocalDateTime.now(); // 현재 날짜시간 출력
	
		LocalDateTime xday = LocalDateTime.of(1993, 1, 15, 5, 0, 0); // 지정한 날짜시간 출력
		
		// a.until(b, unit); period from a to b (a is not counted)
		long year = xday.until(today, ChronoUnit.YEARS);
		long month = xday.until(today, ChronoUnit.MONTHS);
		long day = xday.until(today, ChronoUnit.DAYS);
		long hour = xday.until(today, ChronoUnit.HOURS);
		long minute = xday.until(today, ChronoUnit.MINUTES);
		long second = xday.until(today, ChronoUnit.SECONDS);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		

	}

}
