package LessonA8_SortingAlgorithms;

public class SelectionSort3 {

	public static void main(String[] args) {
		
		// * 인덱스 번호가 높을 수록 높은 값을 가지도록 프로그래밍 하시오.
		
		int aa[] = new int[6];
		int x;

		for(int i=0; i<aa.length; i++)
			aa[i]=(int)(Math.random()*45)+1;
		
		
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
		
		if(aa[0]>aa[3]) {
			x = aa[0];
			aa[0] = aa[3];
			aa[3] = x;
		}
		
		if(aa[0]>aa[4]) {
			x = aa[0];
			aa[0] = aa[4];
			aa[4] = x;
		}
		
		if(aa[0]>aa[5]) {
			x = aa[0];
			aa[0] = aa[5];
			aa[5] = x;
		}
		
		if(aa[1]>aa[2]) {
			x = aa[1];
			aa[1] = aa[2];
			aa[2] = x;
		}
		
		if(aa[1]>aa[3]) {
			x = aa[1];
			aa[1] = aa[3];
			aa[3] = x;
		}
		
		if(aa[1]>aa[4]) {
			x = aa[1];
			aa[1] = aa[4];
			aa[4] = x;
		}
		
		if(aa[1]>aa[5]) {
			x = aa[1];
			aa[1] = aa[5];
			aa[5] = x;
		}
		
		if(aa[2]>aa[3]) {
			x = aa[2];
			aa[2] = aa[3];
			aa[3] = x;
		}
		
		if(aa[2]>aa[4]) {
			x = aa[2];
			aa[2] = aa[4];
			aa[4] = x;
		}
		
		if(aa[2]>aa[5]) {
			x = aa[2];
			aa[2] = aa[5];
			aa[5] = x;
		}
		
		if(aa[3]>aa[4]) {
			x = aa[3];
			aa[3] = aa[4];
			aa[4] = x;
		}
		
		if(aa[3]>aa[5]) {
			x = aa[3];
			aa[3] = aa[5];
			aa[5] = x;
		}
		
		if(aa[4]>aa[5]) {
			x = aa[4];
			aa[4] = aa[5];
			aa[5] = x;
		}
		
		for(int i=0; i<aa.length;i++)
			System.out.print(aa[i]+" ");

	}
}
