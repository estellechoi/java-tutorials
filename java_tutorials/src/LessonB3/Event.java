package LessonB3;

import java.time.LocalDateTime;
import java.time.Period;

public class Event {

	public static void main(String[] args) {

//		�ΰ��� ������ 100���̰�, ��� �ϳ� �ǿ�� ������ 2000�� ����ȴ�.
//		������ �� ���� ��踦 20�Ⱓ �Ϸ翡 40���Ǿ� �ǿ� ����� ������ �� �� �ִ°�

		// 100�� (��)
		long humanlife_min = 100 * 365 * 24 * 60;

		// 20�Ⱓ �ǿ� ����
		long howmanyciga = 40 * 365 * 20;
		
		// �پ�� ���� (��)
		long lifeDesMin = howmanyciga*2000;
		
		// �پ�� ���� (��)
		long lifeDesYear = ((lifeDesMin/60)/24)/365;
		
		System.out.println(lifeDesYear);
	}

}
