package Lesson1_int;

public class question6 {

	public static void main(String[] args) {

		//6. 1부터 100까지의 숫자중 3의 배수가 아닌것의 합을 출력하시오.

		
		int n = 0;
		
		
			for (int i=1;i<=100;i++) {
				if(i%3 != 0) {
					n=n+i;           
				}
			}

		System.out.println(n);


	}

}
