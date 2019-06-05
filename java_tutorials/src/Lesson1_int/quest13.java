package Lesson1_int;

public class quest13 {

	public static void main(String[] args) {
		// 1부터 100까지의 짝수의 합을 출력하시오.
		
		int n=0;
		
		for (int i=1; i<=100; i++) {
			if(i%2==0)
			n=n+i;
		}
		
		System.out.print(n);

	}

}
