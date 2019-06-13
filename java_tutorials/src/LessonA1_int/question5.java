package LessonA1_int;
import java.util.Scanner;
public class question5 {

	public static void main(String[] args) {
		//5. a부터 b까지의 3의 배수의 합을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("A : "); int a = sc.nextInt();
		System.out.print("B : "); int b = sc.nextInt();
		
		int n = 0;	
		
		if(a<b) {
			for(int i=a;i<=b;i++) {
				if (i%3 == 0) {                            // i%2 == 0; : i를 2로 나눈 나머지가 0이다.
					n=n+i;                               // 3의 배수인 경우에만 i를 더한다 !!! else, nothing happens.
				}
				
			}
		}
		else {
			for(int i=b;i<=a;i++) {
				if (i%3==0) {                            
					n=n+i;
				}
				
			}
		}
		
		System.out.println(n);


	}

}
