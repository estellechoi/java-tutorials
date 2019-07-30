package LessonA8_SortingAlgorithms;

// ������ : ��1���� n������������ ���ӵ� �ڿ����� ����, ����, �밢���� ���� ���������� ���簢�� ������� �迭�� ��
// Ǯ�� !
// 1) ������ ù��°�� �߾�
// 2) ���� ���ڴ� �� -1, �� +1 �̵�
// 3) ���� ���� -1�� �� ���, -1 => (n-1) ����
// 4) ���� ���� n �� �� ���, n => 0 ����
// 5) �̵��� ���� ���� �����ϴ� ���, �� +2, �� -1
// 6) ��� ���� ��� �迭 ���� ���, �� +2, �� -1
import java.util.Scanner;

public class ArrayTwoDimensional_mabangjin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[][] = new int[n][n];
		int x = 0;
		int y = n / 2;

		for (int i = 1; i <= n * n; i++) {
			arr[x][y] = i;
			x = x - 1;
			y = y + 1;

			if (x == -1 && y == n) {
				x = x + 2;
				y = y - 1;
			}

			if (x == -1) {
				x = n - 1;
			}

			if (y == n) {
				y = 0;
			}

			// �̵��� ��ġ�� �̹� ���� �����ϴ� ���
			if (arr[x][y] != 0) {
				x = x + 2;
				y = y - 1;
			}

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();

		}

	}

}
