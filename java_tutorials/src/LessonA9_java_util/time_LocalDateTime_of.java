package LessonA9_java_util;

import java.time.LocalDateTime;

public class time_LocalDateTime_of {

	public static void main(String[] args) {

		// ���� ���
		LocalDateTime today = LocalDateTime.now();

		String dayEng = today.getDayOfWeek().toString(); // ���� ���� ���

		System.out.println(dayEng);

		// LocalDateTime.of(year, month, date, hour, minute, second);
		LocalDateTime xday = LocalDateTime.of(1989, 3, 27, 0, 0, 0);

		String xdayEng = xday.getDayOfWeek().toString();

		System.out.println(xdayEng);

	}

}
