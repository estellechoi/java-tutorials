package LessonA8_SortingAlgorithms;

public class ArrayTwoDimensional_zz {

	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int n = 1;

		for (int i = 0; i < 5; i++) {

			// i = 1, 3, 5 È¦¼ö
			if (i % 2 == 1) {
				for (int j = 4; j >= 0; j--) {
					arr[i][j] = n;
					n++;
				}
			}

			// i = 0, 2, 4 Â¦¼ö
			if (i % 2 == 0) {
				for (int j = 0; j < 5; j++) {
					arr[i][j] = n;
					n++;
				}

			}

		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();

		}

	}

}
