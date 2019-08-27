// * 중복/순서 없는 데이터 처리시 Set 사용
package LessonB9_Collections;

import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;

public class Set_ {

	public static void main(String[] args) {

		// * Set은 HashSet의 상위 인터페이스 (HashSet은 Set 클래스를 상속)
		// * HashSet은 클래스 Set을 데이터 형으로 삼을 수 있음 (다형성, Polymorphism)
		Set hs = new HashSet();

		hs.add("유진");
		hs.add("용기");
		hs.add("승국");
		hs.add("선아");
		hs.add("형우");
		hs.add("동현");
		hs.add("동현");
		
		// * Set은 데이터 중복 불가, 순서 없음
		// * Set은 순서가 없으므로 데이터를 추가한 순서대로 출력되지 않음
		// * 같은 데이터를 추가하면 데이터 중복이므로 1 개 데이터만 저장됨
		System.out.println(hs);
		
		hs.remove("승국");
		System.out.println(hs);
		
		// * 반복 데이터를 다루는 Iterator를 사용하여 Set 집합을 출력하기
		// * 특히 인덱스가 없는 Set 집합의 데이터를 불러올 때 적합
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
