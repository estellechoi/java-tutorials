// LinkedList.add(index, element);
// ������ ����/���� �۾��� ���� ���� ArrayList ���� LinkedList�� ����
package LessonB9_Collections;

import java.util.LinkedList;

public class LinkedList_Iterator {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add("����");
		ll.add("���");
		ll.add(1000);
		
		System.out.println(ll);
		
		// * ������ �ε����� ��� �߰��ϱ�
		
		ll.add(1, "�±�");
		System.out.println(ll);

	}

}

