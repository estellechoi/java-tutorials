package LessonB9_Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_HashSet_lotto {

	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<Integer>();

		// * 일반 배열 (중복 발생)
		int lotto[] = new int[6];
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
		}

		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		System.out.println();

		// * Set (중복 피하기)
		while (s1.size() < 6) { // 데이터가 쌓여서 사이즈가 6이 되면 반복문 중단
			int num = (int) (Math.random() * 45) + 1;
			s1.add(num);
			System.out.println(" * 문자가 6개보다 크면 중복이 발생했던 것");
		}
		
		System.out.println(s1);

	}

}
