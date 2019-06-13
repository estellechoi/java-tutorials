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
		LocalDate to = today.toLocalDate();
		
		// isLeapYear() : ����(2�� 29���� �ִ� ��/4�⿡ 1��) ����
		// �����̸� true �ƴϸ� false
		System.out.println(to.isLeapYear());
		
		String print = year + "��  " + month + "�� " + date + "�� ";
		print = print + dayKor + " " + hh + " : " + mm + " : " + ss + " : ";
		
		System.out.println(print);

		// LocalDate() ���� ��ü����
		// LocalDate today = LocalDate.now();
		// LocalTime() �ú��� ��ü����:
		// LocalDate today = LocalTime.now();
		// LocalDateTime ����Ͻú��� ��ü����
		// LocalDateTime today = LocalDateTime.now();
	}

}
