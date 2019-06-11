package Lesson9_java_util;

import java.util.Calendar;

public class util_Calendar2 {

	public static void main(String[] args) {

		Calendar today = Calendar.getInstance();

		// today.get(int field);
		int y = today.get(Calendar.YEAR);
		int m = today.get(Calendar.MONTH) + 1;
		int d = today.get(Calendar.DAY_OF_MONTH);

		// 일 : 1 ~ 토 : 7
		int day = today.get(Calendar.DAY_OF_WEEK);
		String dayKor[] = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };

		/*
		 * String kor;
		 * switch(day) {
		 * case 1 : kor="일요일"; break;
		 * case 2 : kor="월요일"; break;
		 * case 3 : kor="화요일"; break;
		 * case 4 : kor="수요일"; break;
		 * case 5 : kor="목요일"; break;
		 * case 6 : kor="금요일"; break;
		 * case 7 : kor="토요일"; break;
		 * }
		 * */
		
		int ap = today.get(Calendar.AM_PM); // 오전 0 오후 1
		String apKor[] = { "오전", "오후" };
		/*
		 * if(ap == 0) { apm = "오전"; } else { apm = "오후"; }
		 */

		int hh = today.get(Calendar.HOUR);
		int mm = today.get(Calendar.MINUTE);
		int ss = today.get(Calendar.SECOND);

		System.out.println(y + " 년 " + m + " 월 " + d + " 일");
		System.out.println(dayKor[day - 1]);
		System.out.println(apKor[ap]);
		System.out.println(hh + " 시 " + mm + " 분 " + ss + " 초");

		// System.out.println(today.toString());

	}

}
