package LessonA8_SortingAlgorithms;

public class ArraySort {

	public static void main(String[] args) {

		int lotto[] = new int[4];

		for (int i = 0; i < 4; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
		}

		// 배열 값을 낮은 순으로 정렬

		int x; // 값 치환을 위한 임시 변수

		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 4; j++) {
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
