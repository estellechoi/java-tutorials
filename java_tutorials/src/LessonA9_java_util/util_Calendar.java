package LessonA9_java_util;
import java.util.Calendar;

public class util_Calendar {

	public static void main(String[] args) {
		
		// �� Date today = new Date(); (��ü ����)
		
		// �� Calendar today = Calendar.getInstance(); (����)
		
		// * Cannot instantiate automatically. ��ü���� �Ұ�
		// �� the constructor Calendar is private. (singleton)
		//    public static Calendar getInstance(){} ��ü���� ���� ����
		
		Calendar today = Calendar.getInstance();
		int ap = today.get(Calendar.AM_PM); // ���� 0 ���� 1
		System.out.println(ap);
		
		// today.get(int field);
		int y = today.get(Calendar.YEAR);
		int m = today.get(Calendar.MONTH)+1;
		int d = today.get(Calendar.DAY_OF_MONTH);
		
		int day = today.get(Calendar.DAY_OF_WEEK);
		// �� : 1 ~ �� : 7 
		
		int hh = today.get(Calendar.HOUR);
		int mm = today.get(Calendar.MINUTE);
		int ss = today.get(Calendar.SECOND);
		
		System.out.println(y+ " �� "+m+" �� "+d+" ��");
		System.out.println(day + " ����");
		System.out.println(hh+" �� "+mm+" �� "+ss+" ��");

		// System.out.println(today.toString());

	}

}
