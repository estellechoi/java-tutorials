// �迭�� ����Ʈ�� ��ȯ�ϱ� / ArrayList�� ���� �������̽� List
// List�� ArrayList, LinkedList Ŭ������ ���� �������̽�
package LessonB9_Collection;

import java.util.Arrays;
import java.util.List;

public class Arrays_asList {

	public static void main(String[] args) {
		
		// * �迭
		String name[] = new String[5];
		name[0] = "����";
		name[1] = "����";
		name[2] = "����";
		name[3] = "����";
		name[4] = "����";
		
		// * �迭�� ����Ʈ�� ��ȯ�ϱ�
		// * Arrays Ŭ���� asList �޼ҵ带 ��� // cf) Integer.parseInt(String);
		// * List�� ArrayList�� ���� �������̽�
		List<String> li = Arrays.asList(name);
		
		// * ArrayList 2�� �ε��� �� ȣ��
		System.out.println(li.get(2));

	}

}
