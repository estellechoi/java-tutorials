package LessonA8_SortingAlgorithms;

// 마방진 : ‘1부터 n제곱’까지의 연속된 자연수를 가로, 세로, 대각선의 합이 같아지도록 정사각형 모양으로 배열한 것
// 풀이 !
// 1) 시작은 첫번째행 중앙
// 2) 다음 숫자는 행 -1, 열 +1 이동
// 3) 행의 값이 -1이 될 경우, -1 => (n-1) 변경
// 4) 열의 값이 n 이 될 경우, n => 0 변경
// 5) 이동할 곳에 값이 존재하는 경우, 행 +2, 열 -1
// 6) 행과 열이 모두 배열 밖인 경우, 행 +2, 열 -1
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

			// 이동할 위치에 이미 값이 존재하는 경우
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
