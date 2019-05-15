package test_array;

public class Array3_demension {

	public static void main(String[] args) {
		
		// 2차원 배열
		
		int arr[][] = new int[5][5];
		
		for(int i=0; i<5; i++) 
			for(int j=0; j<5; j++)
				arr[i][j]=99;                    // i=0 > j=0~4   -> i=1 > j=0~4   -> ··· -> i=4 > j=0~4
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++)
				System.out.printf("%3d", arr[i][j]);
			System.out.println(" ");                 // i 행 반복시마다  줄바꿈 출력 ! println(" ")
		}
		
		int ran[][] = new int[6][6];
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				ran[i][j]=(int)(Math.random()*36)+1;
			}
		}
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) 
				System.out.printf("%3d", ran[i][j]); // printf -> 자리맞추기 (format: "%3d" -> 3칸짜리로..) %c : 문자형(char) %f 실수
			System.out.println();
		}
		
		System.out.printf("%3d",2);
		System.out.println();
		System.out.println("마방진");
		
		//마방진
		
		// 1) 시작은 첫 행의 가운데에서 1.
		// 2) 다음 숫자는 오른쪽 +1칸 위 +1칸. for -> (i-1, j+1) / if(i<=1) -> i=제일 높은 값. && if(j>=5) -> j=0 && if (값존재) 밑-2칸 왼-1칸 (i+2, j-1) 
		
		
		
		
		
	}

}
