package LessonA9_java_util;
import java.util.Date;

public class util_Date {

	public static void main(String[] args) {
		
		// Date()
		Date today = new Date();
		
		int y = today.getYear()+1900; // getFullYear() �ȵǳ� ..
		int m = today.getMonth()+1;
		int d = today.getDate();
		int day = today.getDay();
		int hh = today.getHours();
		int mm = today.getMinutes();
		int ss = today.getSeconds();
		
		String date = y+" �� "+m+" �� "+d+" �� ";
		String daystr = day + " ����";
		String time = hh+" ��  "+mm+" �� "+ss+" �� ";
		
		System.out.println(date);
		System.out.println(daystr);
		System.out.println(time);

		
		// toString(); ��ü������ ���ڿ��� ��ȯ
		// �ڵ���� (��� ��ü���� ��� ����)
		System.out.println(today.toString());

	}

}
