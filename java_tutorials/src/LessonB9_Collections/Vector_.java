// * Vector�� �ڹ� 1.0 ���� ����ϴ� Ŭ���� (�ӵ� ����)
// * Vector�� ������ ������ ���� ������
package LessonB9_Collections;

import java.util.Vector;

public class Vector_ {

	public static void main(String[] args) {

		Vector<String> vc = new Vector<String>();
		vc.add("����");
		vc.add("���");
		System.out.println(vc);

		// * ������ �ε����� ��� �߰��ϱ�
		vc.add(1, "�±�");
		System.out.println(vc);

	}

}
