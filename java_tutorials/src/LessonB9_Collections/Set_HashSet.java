// * �ߺ�/���� ���� ������ ó���� HashSet ���
package LessonB9_Collections;

import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;

public class Set_HashSet {

	public static void main(String[] args) {

		// * Set�� HashSet�� ���� �������̽� (HashSet�� Set Ŭ������ ���)
		// * HashSet�� Ŭ���� Set�� ������ ������ ���� �� ���� (������, Polymorphism)
		Set hs = new HashSet();

		hs.add("����");
		hs.add("���");
		hs.add("�±�");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		
		// * HashSet�� ������ �ߺ� �Ұ�, ���� ����
		// * HashSet�� ������ �����Ƿ� �����͸� �߰��� ������� ��µ��� ����
		// * ���� �����͸� �߰��ϸ� ������ �ߺ��̹Ƿ� 1 �� �����͸� �����
		System.out.println(hs);
		
		// * ������ ���� �޼ҵ�
		hs.remove("�±�");
		System.out.println(hs);
		
		// * Set ������ ũ�� Ȯ�� �޼ҵ�
		System.out.println(hs.size());
		
		// * �ݺ� �����͸� �ٷ�� Iterator�� ����Ͽ� Set ������ ����ϱ�
		// * Ư�� �ε����� ���� Set ������ �����͸� �ҷ��� �� ����
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}