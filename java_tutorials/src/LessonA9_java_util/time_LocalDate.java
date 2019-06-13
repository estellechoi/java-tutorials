package LessonA9_java_util;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class time_LocalDate {

	public static void main(String[] args) {

		// ⓐ LocalDateTime
		LocalDateTime today = LocalDateTime.now();

		// Date methods
		int year = today.getYear(); 
		int month = today.getMonthValue();
		int date = today.getDayOfMonth();
		
		int hh = today.getHour();
		int mm = today.getMinute();
		int ss = today.getSecond();

		// toString() : 문자로 출력
		String dayKor = today.getDayOfWeek().toString();
		// getValue() : 숫자로 출력
		int dayInt = today.getDayOfWeek().getValue();

		// ⓑ LocalDate
		LocalDate to = today.toLocalDate();
		
		// isLeapYear() : 윤년(2월 29일이 있는 해/4년에 1번) 여부
		// 윤년이면 true 아니면 false
		System.out.println(to.isLeapYear());
		
		String print = year + "년  " + month + "월 " + date + "일 ";
		print = print + dayKor + " " + hh + " : " + mm + " : " + ss + " : ";
		
		System.out.println(print);

		// LocalDate() 월일 객체생성
		// LocalDate today = LocalDate.now();
		// LocalTime() 시분초 객체생성:
		// LocalDate today = LocalTime.now();
		// LocalDateTime 년월일시분초 객체생성
		// LocalDateTime today = LocalDateTime.now();
	}

}
