package LessonA9_java_util;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class time_LocalDate {

	public static void main(String[] args) {

		// �� LocalDateTime
		LocalDateTime today = LocalDateTime.now();

		// Date methods
		int year = today.getYear(); 
		int month = today.getMonthValue();
		int date = today.getDayOfMonth();
		
		int hh = today.getHour();
		int mm = today.getMinute();
		int ss = today.getSecond();

		// toString() : ���ڷ� ���
		String dayKor = today.getDayOfWeek().toString();
		// getValue() : ���ڷ� ���
		int dayInt = today.getDayOfWeek().getValue();

		// �� LocalDate
		// isLeapYear() : ���� ����
		LocalDate toto = today.toLocalDate();
		System.out.println(toto.isLeapYear());
		
		// ������ �ؿ��� true �ƴ϶�� false // today.toLocalDate();

		/*
		 * time ��Ű��
		 * 
		 * LocalDate ->����� ��ü����: LocalDate today=LocalDate.now(); LocalTime �ú��� ��ü����:
		 * LocalDate today=LocalTime.now(); LocalDateTime ����Ͻú��� ��ü����: LocalDate
		 * today=LocalDateTime.now();
		 * 
		 * 
		 * 
		 */

		String chul = y + "��" + m + "��" + d + "��" + yo + " " + hh + "�� " + mm + "��" + ss + "��";
		System.out.println(chul);

	}

}
