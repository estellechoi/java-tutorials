package Lesson9_java_util;

import java.util.Calendar;

public class util_Calendar2 {

	public static void main(String[] args) {

		Calendar today = Calendar.getInstance();

		// today.get(int field);
		int y = today.get(Calendar.YEAR);
		int m = today.get(Calendar.MONTH) + 1;
		int d = today.get(Calendar.DAY_OF_MONTH);

		// �� : 1 ~ �� : 7
		int day = today.get(Calendar.DAY_OF_WEEK);
		String dayKor[] = { "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����" };

		/*
		 * String kor;
		 * switch(day) {
		 * case 1 : kor="�Ͽ���"; break;
		 * case 2 : kor="������"; break;
		 * case 3 : kor="ȭ����"; break;
		 * case 4 : kor="������"; break;
		 * case 5 : kor="�����"; break;
		 * case 6 : kor="�ݿ���"; break;
		 * case 7 : kor="�����"; break;
		 * }
		 * */
		
		int ap = today.get(Calendar.AM_PM); // ���� 0 ���� 1
		String apKor[] = { "����", "����" };
		/*
		 * if(ap == 0) { apm = "����"; } else { apm = "����"; }
		 */

		int hh = today.get(Calendar.HOUR);
		int mm = today.get(Calendar.MINUTE);
		int ss = today.get(Calendar.SECOND);

		System.out.println(y + " �� " + m + " �� " + d + " ��");
		System.out.println(dayKor[day - 1]);
		System.out.println(apKor[ap]);
		System.out.println(hh + " �� " + mm + " �� " + ss + " ��");

		// System.out.println(today.toString());

	}

}
