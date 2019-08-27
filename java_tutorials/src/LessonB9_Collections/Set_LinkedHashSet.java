package LessonB9_Collections;

import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_LinkedHashSet {

	public static void main(String[] args) {

		// * 순서가 있는 데이터 처리를 위해 HashSet 대신 LinkedHashSet 사용
		Set hs = new LinkedHashSet();

		hs.add("유진");
		hs.add("용기");
		hs.add("승국");
		hs.add("선아");
		hs.add("형우");
		hs.add("동현");
		hs.add("동현");
		
		// * 반복 데이터를 다루는 Iterator를 사용하여 Set 집합을 출력하기
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
