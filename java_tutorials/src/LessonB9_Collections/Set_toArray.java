// * Set을 인덱스가 있는 배열로 변환하기
// * Object obj[] = Set.toArray();
package LessonB9_Collections;

import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;

public class Set_toArray {

	public static void main(String[] args) {

		Set hs = new HashSet();

		hs.add("유진");
		hs.add("용기");
		hs.add("승국");
		hs.add("선아");
		hs.add("형우");
		hs.add("동현");
		hs.add("동현");
		
		System.out.println(hs);
		
		// * Set을 인덱스가 있는 배열로 변환하기
		// * Set.toArray() 메소드 사용, 자료형은 Object 배열
		Object obj[] = hs.toArray();
		
		for(int i=0; i<obj.length; i++) {
			System.out.println(obj[i]);
		}
	}

}
