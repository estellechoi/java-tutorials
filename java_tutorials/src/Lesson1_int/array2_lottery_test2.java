package Lesson1_int;

public class array2_lottery_test2 {

	public static void main(String[] args) {
		
		int lo [] =new int [6];
		
		for(int i=0; i<lo.length; i++) {
			lo[i] = (int)(Math.random()*45)+1;
			
				for(int j=0; j<=i-1; j++) {
					if (lo[j]==lo[i]) {
						i = i-1;
					}
				}
		}
		
		for(int i=0; i<lo.length; i++) {
			System.out.print(lo[i]+" ");
		}

	}

}
