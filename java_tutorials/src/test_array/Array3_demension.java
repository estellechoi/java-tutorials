package test_array;

public class Array3_demension {

	public static void main(String[] args) {
		
		// 2���� �迭
		
		int arr[][] = new int[5][5];
		
		for(int i=0; i<5; i++) 
			for(int j=0; j<5; j++)
				arr[i][j]=99;                    // i=0 > j=0~4   -> i=1 > j=0~4   -> ������ -> i=4 > j=0~4
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++)
				System.out.printf("%3d", arr[i][j]);
			System.out.println(" ");                 // i �� �ݺ��ø���  �ٹٲ� ��� ! println(" ")
		}
		
		int ran[][] = new int[6][6];
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				ran[i][j]=(int)(Math.random()*36)+1;
			}
		}
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) 
				System.out.printf("%3d", ran[i][j]); // printf -> �ڸ����߱� (format: "%3d" -> 3ĭ¥����..) %c : ������(char) %f �Ǽ�
			System.out.println();
		}
		
		System.out.printf("%3d",2);
		System.out.println();
		System.out.println("������");
		
		//������
		
		// 1) ������ ù ���� ������� 1.
		// 2) ���� ���ڴ� ������ +1ĭ �� +1ĭ. for -> (i-1, j+1) / if(i<=1) -> i=���� ���� ��. && if(j>=5) -> j=0 && if (������) ��-2ĭ ��-1ĭ (i+2, j-1) 
		
		
		
		
		
	}

}
