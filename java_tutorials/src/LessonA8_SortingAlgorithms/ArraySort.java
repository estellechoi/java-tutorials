package LessonA8_SortingAlgorithms;

public class ArraySort {

	public static void main(String[] args) {

		int lotto[] = new int[4];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
		}

		// �迭 ���� ���� ������ ����

		int x; // �� ġȯ�� ���� �ӽ� ����

		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					x = lotto[j];
					lotto[j] = lotto[i];
					lotto[i] = x;
				}

			}
			System.out.println(lotto[i]);

		}

	}

}