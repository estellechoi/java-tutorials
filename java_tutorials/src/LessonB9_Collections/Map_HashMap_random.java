package LessonB9_Collections;

import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class Map_HashMap_random {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<Integer, String>();

		// * 10 ���� ������ key �� key �� �߰��ϱ�
		Scanner sc = new Scanner(System.in);
		String data;
		int num;

		for (int i = 0; i < 10; i++) {
			num = (int) (Math.random() * 100) + 1;
			data = sc.next();
			
			// * key �ߺ� �����ϱ�
			if (hm.containsKey(num)) {
				i = i - 1; // �ش� �� �����
			} else {
				hm.put(num, data); // key/�� �߰��ϰ� ���� ������
			}
		}

		// * key �ߺ� ������ ���� �ʾҴٸ� 10���� �����Ͱ� ��µ��� ���� �� �ִ�
		//   �ߺ��� key�� �߻��ؼ� ���� �߰��� �����Ͱ� �����Ǿ��� ���� !
		System.out.println(hm);

	}

}
