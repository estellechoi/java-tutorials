// * Vector는 자바 1.0 부터 사용하던 클래스 (속도 느림)
// * Vector의 장점은 스레드 사용시 유리함 (동기화)
package LessonB9_Collections;

import java.util.Vector;

public class List_Vector {

	public static void main(String[] args) {

		Vector<String> vc = new Vector<String>();
		vc.add("유진");
		vc.add("용기");
		System.out.println(vc);

		// * 지정한 인덱스에 요소 추가하기
		vc.add(1, "승국");
		System.out.println(vc);

	}

}
