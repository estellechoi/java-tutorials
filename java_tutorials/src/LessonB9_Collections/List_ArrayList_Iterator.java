// ArrayList, LinkedList Ŭ���� �� List�� ���� �������̽�
// * �迭�� �ѹ� ������ �迭�� ũ�⸦ �ٲ� �� ������, ArrayList�� ũ�⸦ �̸� �������� �ʾ� �󸶵��� ���� ���� ���� ���� ����
// * ArrayList�� Vector���� ���� (����ȭX)
// * 
package LessonB9_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class List_ArrayList_Iterator {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		// ���� �ٸ� �ڷ����̴��� ���� ArrayList�� �߰��� �� �ִ�
		al.add("����");
		al.add("���");
		al.add("����");
		al.add("����");
		al.add(100);
		System.out.println(al);
		
		// * ���� �޼ҵ�
		al.remove(3);
		System.out.println(al);
		
		ArrayList<String> alS = new ArrayList<String>();
		alS.add("��ȣ");
		alS.add("�翵");
		alS.add("����");
		alS.add("����");
		// alS.add(27); // �ٸ� �ڷ��� �߰� �Ұ�
		System.out.println(alS);
		
		// * �ε��� �� ȣ�� �޼ҵ�
		System.out.println(alS.get(2));
		// * ArrayList ũ�� �޼ҵ�
		System.out.println(alS.size());
		
		// * Iterator�� ����Ͽ� List�� ���� �ݺ��Ǵ� ������ ��������
		Iterator it = alS.iterator();
		
		// * Iterator ��ü�� ��尡 �����ϸ� �ݺ��� ����
		// * Iterator.hasNext(); ��� ���翩�� Ȯ�� �޼ҵ� boolean
		// * Iterator.next(); ������ ȣ�� �޼ҵ�
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
