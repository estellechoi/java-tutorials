package LessonB3;

import java.time.LocalDateTime;
import java.time.Period;

public class Event {

	public static void main(String[] args) {

//		인간의 수명이 100년이고, 담배 하나 피우면 수명이 2000분 단축된다.
//		성인이 된 이후 담배를 20년간 하루에 40개피씩 피운 사람은 몇살까지 살 수 있는가

		// 100년 (분)
		long humanlife_min = 100 * 365 * 24 * 60;

		// 20년간 피운 개수
		long howmanyciga = 40 * 365 * 20;
		
		// 줄어든 수명 (분)
		long lifeDesMin = howmanyciga*2000;
		
		// 줄어든 수명 (년)
		long lifeDesYear = ((lifeDesMin/60)/24)/365;
		
		System.out.println(lifeDesYear);
	}

}
