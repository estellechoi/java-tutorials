// * 큐 메모리 구조
// 선입선출(FIFO)
// 클래스로 구현된 스택과는 달리 자바에서 큐 메모리 구조는 별도의 인터페이스 형태로 제공

// * Queue 인터페이스를 상속받는 하위 인터페이스
// 1) Deque
// 2) BlockingDeque
// 3) BlockingQueue
// 4) TransferQueue
// 그중에서도 Deque 인터페이스를 구현한 LinkedList 클래스가 큐 메모리 구조를 구현하는 데 가장 많이 사용
// 더욱 복잡하고 빠른 큐를 구현하고 싶다면 Deque 인터페이스를 구현한 ArrayDeque 클래스를 사용
package LessonB9_Collections;

import java.util.Queue;
import java.util.LinkedList;

public class List_Queue {

	public static void main(String[] args) {
		
		Queue<String> que = new LinkedList<String>();
		
		que.add("youjin");
		que.add("yongki");
		que.add("youbin");	
		System.out.println(que);
		
		// * 데이터 추가 메소드
		que.add("donghyun");
		System.out.println(que);
		
		// * 데이터 삭제 메소드 (선입선출)
		que.remove();
		System.out.println(que);
		
		// * 데이터 삭제 메소드 (값 지정)
		que.remove("youbin");
		System.out.println(que);
		

	}

}
