package Lesson8_SortingAlgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		
		int ar[] = new int[2];
		int x; // ġȯ�� �ӽú���

		for(int i=0; i<ar.length; i++)
			ar[i]=(int)(Math.random()*45)+1;
			
	    // * 0�� �ε����� �������� ������ �ְ� ���α׷��� �Ͻÿ�.
		//   �� ar[0] �� ar[1] �� ��ȯ
	    
		if(ar[0]>ar[1]) {
	       	x = ar[0];
	       	ar[0] = ar[1];
	       	ar[1] = x;
	    }
	    
	    for(int i=0; i<ar.length; i++)
	    	System.out.print(ar[i]+" ");

	}
}
