package LessonA8_SortingAlgorithms;

public class SelectionSort4 {

	public static void main(String[] args) {
		
		// * 인덱스 번호가 높을 수록 높은 값을 가지도록 프로그래밍 하시오.
		
		int aa[] = new int[20];
		int x;
		
		for(int i=0; i<aa.length; i++)
			aa[i]=(int)(Math.random()*45)+1;
		
		// 정렬 알고리즘
		for(int j=0; j<aa.length-1; j++) {
			
			for(int i=j+1; i<aa.length; i++) {
				if(aa[j]>aa[i]) {
					x = aa[j];
					aa[j] = aa[i];
					aa[i] = x;
				}				
			}
			
		}
		
		for(int i=0; i<aa.length; i++)
			System.out.print(aa[i]+" ");
		
		
		

	}
}
