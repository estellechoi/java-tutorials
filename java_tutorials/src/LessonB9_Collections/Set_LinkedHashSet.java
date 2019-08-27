package LessonB9_Collections;

import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_LinkedHashSet {

	public static void main(String[] args) {

		// * ������ �ִ� ������ ó���� ���� HashSet ��� LinkedHashSet ���
		Set hs = new LinkedHashSet();

		hs.add("����");
		hs.add("���");
		hs.add("�±�");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		
		// * �ݺ� �����͸� �ٷ�� Iterator�� ����Ͽ� Set ������ ����ϱ�
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
