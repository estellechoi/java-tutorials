package test_fir;

public class quest14 {

	public static void main(String[] args) {
		// 14. 1부터 100까지의 8의 배수의 합을 출력하시오.
		
		int n=0;
		
		for(int i=1; i<=100; i++) {
			if(i%8==0)
			n=n+i;
		}
		
		System.out.print(n);

	}

}
