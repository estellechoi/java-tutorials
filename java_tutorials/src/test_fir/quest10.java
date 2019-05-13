package test_fir;
import java.util.Scanner;
public class quest10 {

	public static void main(String[] args) {
		// 10. Scanner를 통해 num1,num2라는 변수에 값을 저장한 후 둘중에 큰수를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("no.1 : "); int num1=sc.nextInt();
		System.out.print("no.1 : "); int num2=sc.nextInt();
		
		if (num1>num2) 
			System.out.println("result: "+num1);
		
		else
			System.out.println("result: "+num2);
		


	}

}
