package LessonA9_java_util;

import java.time.LocalDateTime;
import java.time.Period;

public class time_Period {

	public static void main(String[] args) {

		LocalDateTime today = LocalDateTime.now();

		LocalDateTime xday = LocalDateTime.of(2018, 5, 5, 0, 0, 0);

		// Period.between(a,b);
		Period howLong = Period.between(xday.toLocalDate(), today.toLocalDate());

		int year = howLong.getYears();
		int month = howLong.getMonths();
		int day = howLong.getDays();

		// ºñ±³
		System.out.println(howLong);
		
		System.out.println(year + " years " + month + " months " + day + " days");

	}

}
