// LinkedList.add(index, element);
// 데이터 수정/삭제 작업이 많을 때는 ArrayList 보다 LinkedList가 나음
package LessonB9_Collections;

import java.util.LinkedList;

public class LinkedList_Iterator {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add("유진");
		ll.add("용기");
		ll.add(1000);
		
		System.out.println(ll);
		
		// * 지정한 인덱스에 요소 추가하기
		
		ll.add(1, "승국");
		System.out.println(ll);

	}

}

