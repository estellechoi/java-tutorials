package Lesson8_SortingAlgorithms;

public class SelectionSort2 {

	public static void main(String[] args) {
		
		// * �ε��� ��ȣ�� ���� ���� ���� ���� �������� ���α׷��� �Ͻÿ�.
		
		int aa[] = new int[3];
		int x; // ġȯ��

		for(int i=0; i<aa.length; i++)
			aa[i] = (int)(Math.random()*45)+1;
		
		
		if(aa[0]>aa[1]) {
			x = aa[0];
			aa[0] = aa[1];
			aa[1] = x;
		}
		
		if(aa[0]>aa[2]) {
			x = aa[0];
			aa[0] = aa[2];
			aa[2] = x;
		}
		
		if(aa[1]>aa[2]) {
			x = aa[1];
			aa[1] = aa[2];
			aa[2] = x;
		}
		
		for(int i=0; i<aa.length; i++)
			System.out.print(aa[i]+" ");

	}

}
