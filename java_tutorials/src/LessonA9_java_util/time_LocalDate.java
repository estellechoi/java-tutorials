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
		// isLeapYear() : 윤년 여부
		LocalDate toto = today.toLocalDate();
		System.out.println(toto.isLeapYear());
		
		// 윤년인 해에는 true 아니라면 false // today.toLocalDate();

		/*
		 * time 패키지
		 * 
		 * LocalDate ->년월일 객체생성: LocalDate today=LocalDate.now(); LocalTime 시분초 객체생성:
		 * LocalDate today=LocalTime.now(); LocalDateTime 년월일시분초 객체생성: LocalDate
		 * today=LocalDateTime.now();
		 * 
		 * 
		 * 
		 */

		String chul = y + "년" + m + "월" + d + "일" + yo + " " + hh + "시 " + mm + "분" + ss + "초";
		System.out.println(chul);

	}

}
