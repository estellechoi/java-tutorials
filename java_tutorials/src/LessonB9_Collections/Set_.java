// * �ߺ�/���� ���� ������ ó���� Set ���
package LessonB9_Collections;

import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;

public class Set_ {

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
		
		// * Set�� ������ �ߺ� �Ұ�, ���� ����
		// * Set�� ������ �����Ƿ� �����͸� �߰��� ������� ��µ��� ����
		// * ���� �����͸� �߰��ϸ� ������ �ߺ��̹Ƿ� 1 �� �����͸� �����
		System.out.println(hs);
		
		hs.remove("�±�");
		System.out.println(hs);
		
		// * �ݺ� �����͸� �ٷ�� Iterator�� ����Ͽ� Set ������ ����ϱ�
		// * Ư�� �ε����� ���� Set ������ �����͸� �ҷ��� �� ����
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
