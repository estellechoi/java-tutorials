// * ���� �޸� ����
// ���Լ���(LIFO, Last In First Out) : ���� ���߿� �����(push) �����Ͱ� ���� ���� ����(pop)
// ���� �޸� ������ �����͸� ����
// Stack Ŭ������ ���� �޸� ������ ǥ���ϱ� ����, Vector Ŭ������ �޼ҵ带 5���� ��ӹ޾� ���
// ���� �����ϰ� ���� ������ �����ϰ� �ʹٸ� Deque �������̽��� ������ ArrayDeque Ŭ������ ���
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
		
		// * ������ �߰� �޼ҵ� (.push(value))
		st.push("donghyun"); // push = add
		System.out.println(st);
		
		// * ������ ���� �޼ҵ� (.pop())
		// * ���� �������� �Էµ� �����Ͱ� ����ȴ� ! ���Լ���
		st.pop();
		System.out.println(st);
		st.pop();
		System.out.println(st);
		st.pop();
		System.out.println(st);
		
		// * .pop() �޼ҵ��� ���ϰ� �ޱ�
		// * ���� �����ϴ� ���ÿ� st ��ü���� ������ ����Ǿ� �����
		String name = st.pop().toString();
		System.out.println(name);
		System.out.println(st);
		
		// * Object.toString(); ���ڿ��� ��ȯ�� ���� toString()�� Object�� �޼ҵ�
	}

}
