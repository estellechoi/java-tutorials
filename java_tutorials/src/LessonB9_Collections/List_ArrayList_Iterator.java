// ArrayList, LinkedList 클래스 → List는 상위 인터페이스
// * 배열은 한번 정해진 배열의 크기를 바꿀 수 없지만, ArrayList는 크기를 미리 지정하지 않아 얼마든지 많은 수의 값을 저장 가능
// * ArrayList는 Vector보다 빠름 (동기화X)
// * 
package LessonB9_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class List_ArrayList_Iterator {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		// 서로 다른 자료형이더라도 같은 ArrayList에 추가할 수 있다
		al.add("유진");
		al.add("용기");
		al.add("유빈");
		al.add("보민");
		al.add(100);
		System.out.println(al);
		
		// * 삭제 메소드
		al.remove(3);
		System.out.println(al);
		
		ArrayList<String> alS = new ArrayList<String>();
		alS.add("의호");
		alS.add("재영");
		alS.add("유영");
		alS.add("선아");
		// alS.add(27); // 다른 자료형 추가 불가
		System.out.println(alS);
		
		// * 인덱스 값 호출 메소드
		System.out.println(alS.get(2));
		// * ArrayList 크기 메소드
		System.out.println(alS.size());
		
		// * Iterator를 사용하여 List와 같이 반복되는 데이터 가져오기
		Iterator it = alS.iterator();
		
		// * Iterator 객체에 노드가 존재하면 반복문 실행
		// * Iterator.hasNext(); 노드 존재여부 확인 메소드 boolean
		// * Iterator.next(); 데이터 호출 메소드
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
