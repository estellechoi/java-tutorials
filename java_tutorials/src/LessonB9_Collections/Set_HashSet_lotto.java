package LessonB9_Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_HashSet_lotto {

	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<Integer>();

		// * �Ϲ� �迭 (�ߺ� �߻�)
		int lotto[] = new int[6];
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
		}

		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		System.out.println();

		// * Set (�ߺ� ���ϱ�)
		while (s1.size() < 6) { // �����Ͱ� �׿��� ����� 6�� �Ǹ� �ݺ��� �ߴ�
			int num = (int) (Math.random() * 45) + 1;
			s1.add(num);
			System.out.println(" * ���ڰ� 6������ ũ�� �ߺ��� �߻��ߴ� ��");
		}
		
		System.out.println(s1);

	}

}
