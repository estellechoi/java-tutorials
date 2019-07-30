package LessonA8_SortingAlgorithms;

public class ArrayTwoDimensional_for {

	public static void main(String[] args) {

		int arr[][] = new int[5][5];
		int n = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = n;
				n++; // n 없이 i, j 값으로 1 ~ 25 만들기
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
