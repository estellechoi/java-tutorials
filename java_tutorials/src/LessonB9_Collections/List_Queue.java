// * ť �޸� ����
// ���Լ���(FIFO)
// Ŭ������ ������ ���ð��� �޸� �ڹٿ��� ť �޸� ������ ������ �������̽� ���·� ����

// * Queue �������̽��� ��ӹ޴� ���� �������̽�
// 1) Deque
// 2) BlockingDeque
// 3) BlockingQueue
// 4) TransferQueue
// ���߿����� Deque �������̽��� ������ LinkedList Ŭ������ ť �޸� ������ �����ϴ� �� ���� ���� ���
// ���� �����ϰ� ���� ť�� �����ϰ� �ʹٸ� Deque �������̽��� ������ ArrayDeque Ŭ������ ���
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
		
		// * ������ �߰� �޼ҵ�
		que.add("donghyun");
		System.out.println(que);
		
		// * ������ ���� �޼ҵ� (���Լ���)
		que.remove();
		System.out.println(que);
		
		// * ������ ���� �޼ҵ� (�� ����)
		que.remove("youbin");
		System.out.println(que);
		

	}

}
