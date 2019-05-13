package test_fir;

public class question4 {

	public static void main(String[] args) {
		//4. 1부터 100까지의 홀수의 합을 구해서 출력하시오.
		
		// 1 3 5 7 9
		
		int n = 0;
		//n=n+1; // 1
		//n=n+3; // 1+3
		//n=n+5 // 1+3+5
		//n=n+99 	
		
		for(int i=1;i<=100;i++) {
			if (i%2==1) {             // i%2 : i를 2로 나눈 나머지
				n=n+i;
			}
			 
		}
		System.out.println(n);
		
		//4-1. 1부터 100까지의 짝수의 합을 구해서 출력하시오.
		
		int n2= 0;
		
		for(int i=1;i<=100;i++) {
			if (i%2 ==0) {
				n2= n2+i;
			}
		}
		System.out.println(n2);


	}

}
