package LessonA9_java_util;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class time_LocalDateTime {

	public static void main(String[] args) {

		// Date(); ��ü ����
		Date today = new Date();

		// Calendar.getInstance(); �̱��� static ����
		Calendar today2 = Calendar.getInstance();

		// LocalDateTime.now(); �̱��� ?
		LocalDateTime today3 = LocalDateTime.now();

		System.out.println(today.toString());
		System.out.println(today2.toString());
		System.out.println(today3.toString());

	}

}
