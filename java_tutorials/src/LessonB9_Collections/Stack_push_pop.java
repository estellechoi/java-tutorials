// * 스택 메모리 구조
// 후입선출(LIFO, Last In First Out) : 가장 나중에 저장된(push) 데이터가 가장 먼저 인출(pop)
// 선형 메모리 공간에 데이터를 저장
// Stack 클래스는 스택 메모리 구조를 표현하기 위해, Vector 클래스의 메소드를 5개만 상속받아 사용
// 더욱 복잡하고 빠른 스택을 구현하고 싶다면 Deque 인터페이스를 구현한 ArrayDeque 클래스를 사용
package LessonB9_Collections;

import java.util.Stack;

public class Stack_push_pop {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		
		st.add("youjin");
		st.add("yongki");
		st.add("youbin");
		st.add("bomin");	
		System.out.println(st);
		
		// * 데이터 추가 메소드 (.push(value))
		st.push("donghyun"); // push = add
		System.out.println(st);
		
		// * 데이터 인출 메소드 (.pop())
		// * 가장 마지막에 입력된 데이터가 인출된다 ! 후입선출
		st.pop();
		System.out.println(st);
		st.pop();
		System.out.println(st);
		st.pop();
		System.out.println(st);
		
		// * .pop() 메소드의 리턴값 받기
		// * 값을 리턴하는 동시에 st 객체에서 데이터 인출되어 사라짐
		String name = st.pop().toString();
		System.out.println(name);
		System.out.println(st);
		
		// * Object.toString(); 문자열로 변환을 위한 toString()은 Object의 메소드
	}

}
