package LessonA8_SortingAlgorithms;

public class ArrayTwoDimensional_for {

	public static void main(String[] args) {

		int arr[][] = new int[5][5];
		int n = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = n;
				n++; // n ���� i, j ������ 1 ~ 25 �����
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
