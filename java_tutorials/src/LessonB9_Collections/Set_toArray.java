// * Set�� �ε����� �ִ� �迭�� ��ȯ�ϱ�
// * Object obj[] = Set.toArray();
package LessonB9_Collections;

import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;

public class Set_toArray {

	public static void main(String[] args) {

		Set hs = new HashSet();

		hs.add("����");
		hs.add("���");
		hs.add("�±�");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		
		System.out.println(hs);
		
		// * Set�� �ε����� �ִ� �迭�� ��ȯ�ϱ�
		// * Set.toArray() �޼ҵ� ���, �ڷ����� Object �迭
		Object obj[] = hs.toArray();
		
		for(int i=0; i<obj.length; i++) {
			System.out.println(obj[i]);
		}
	}

}
