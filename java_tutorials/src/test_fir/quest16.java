package test_fir;
import java.util.Scanner;
public class quest16 {

	public static void main(String[] args) {
		// 16. Scanner로 n이라는 변수에 값을 입력받은 후  1부터 n 까지의 합을 구하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input any number. ");int n=sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum=sum+i;
		}
		
		System.out.print(sum);

	}

}
