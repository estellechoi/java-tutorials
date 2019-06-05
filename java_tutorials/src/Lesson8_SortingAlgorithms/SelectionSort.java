package Lesson8_SortingAlgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		
		int ar[] = new int[2];
		int x; // 치환용 임시변수

		for(int i=0; i<ar.length; i++)
			ar[i]=(int)(Math.random()*45)+1;
			
	    // * 0번 인덱스가 낮은값을 가질수 있게 프로그래밍 하시오.
		//   → ar[0] ↔ ar[1] 값 교환
	    
		if(ar[0]>ar[1]) {
	       	x = ar[0];
	       	ar[0] = ar[1];
	       	ar[1] = x;
	    }
	    
	    for(int i=0; i<ar.length; i++)
	    	System.out.print(ar[i]+" ");

	}
}
