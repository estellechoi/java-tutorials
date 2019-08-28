package LessonB9_Collections;
// * Collections : �ڷᱸ���� ���� Java Ŭ����

// * List : ���� ����, �ߺ� ��� 
// - Vector
// - ArrayList(�迭���) : �߰��� ������ �Է�/���� ����������, ������ �ٸ� �����͵��� ��ġ �̵� �� ���� ����
// - LinkedList(���Ḯ��Ʈ) : �߰��� ������ �Է�/���� �����ϸ�, ������ �����Ϳ��� ��常 ���� �� ���� ���� X

// * Set : ���� ����, �ߺ��Ұ�
// - HashSet : add ������ �����ϰ� ��ü���� ������ �������� index ����
// - LinkedSet : ���� �ִ� Set, add ������� ����
// - TreeSet : sort

// * Map : index�� ���� ������ (1, "����")

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_LinkedHashSet_lotto {

	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new LinkedHashSet<Integer>();
		Set<Integer> s3 = new TreeSet<Integer>();

		// * LinkedHashSet�� ���� ����
		while (s2.size() < 6) { // �����Ͱ� �׿��� ����� 6�� �Ǹ� �ݺ��� �ߴ�
			int num = (int) (Math.random() * 45) + 1;
			s2.add(num);
			System.out.print(num+" ");
		}
		
		System.out.println();
		System.out.println(s2);

	}

}
