package LessonA1_int;
public class array2_lottery {

	public static void main(String[] args) {
		// Make a lottery program using array. (1~45)
		
		// System.out.println(Math.random()); // Math.random : 0< <1 사이의 값 중 랜덤값
		
		// Random value !
		// int n = (int)(Math.random()*45)+1;  // 0~ 45 >> 1 ~ 45
		
		int lotto[] = new int [6];
		
		for(int i=0;i<=5;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			
			System.out.println(lotto[i]);		
		}
		
		// i<=5 대신 i<lotto.length // int lotto[]의 length는 6 
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i]= (int)(Math.random()*45)+1;
			System.out.println(lotto[i]);
		}
		
		// 6개 숫자의 값이 중복되지 않게 하려면 ?????

				
		for(int i=0;i<lotto.length;i++) {
		
			lotto[i]= (int)(Math.random()*45)+1;
			
			for(int j=0;j<=(i-1);j++)
				if (lotto[j]==lotto[i]) {
					i=i-1;
				}
		}	
			
		for(int i=0;i<lotto.length;i++) {
		
		System.out.print(lotto[i]+" ");
		
		}
			
			/*
			
			if (i==1)

				if (lotto[0]==lotto[1])
					i=i-1;
			
			if (i==2) {
				if (lotto[0]==lotto[2])
					i=i-1;
				if (lotto[1]==lotto[2])
					i=i-1;
			}
				
			if (i==3) {
				if (lotto[0]==lotto[3])
					i=i-1;
				if (lotto[1]==lotto[3])
					i=i-1;
				if (lotto[2]==lotto[3])
					i=i-1;
			}
			
			if (i==4) {
				
				if (lotto[0]==lotto[4])
					i=i-1;
				if (lotto[1]==lotto[4])
					i=i-1;
				if (lotto[2]==lotto[4])
					i=i-1;
				if (lotto[3]==lotto[4])
					i=i-1;
			}
			
			if (i==5) {
				
				if (lotto[0]==lotto[5])
					i=i-1;
				if (lotto[1]==lotto[5])
					i=i-1;
				if (lotto[2]==lotto[5])
					i=i-1;
				if (lotto[3]==lotto[5])
					i=i-1;
				if (lotto[4]==lotto[5])
					i=i-1;
			} */
				
			
			
			

	}

}
