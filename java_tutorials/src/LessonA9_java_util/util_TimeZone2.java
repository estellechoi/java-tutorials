package LessonA9_java_util;
import java.util.TimeZone;

public class util_TimeZone2 {

	public static void main(String[] args) {
		
		// TimeZone IDs by Country

		String tz[] = TimeZone.getAvailableIDs();

		for (int i = 0; i < tz.length; i++) {
			System.out.println(tz[i]);
		}

	}

}
