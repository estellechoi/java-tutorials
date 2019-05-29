package exam0529;
// 사용자에게 1~4의 숫자를 입력받아서 입력받은 숫자에 따라 다음과 같다.
// 1. 짜장면 2. 우동 3. 짬뽕 4. 탕수육
import java.util.Scanner;
public class Exam5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~4 중 하나의 수를 입력하세요.");
		int n=sc.nextInt();
		String result;
		
		switch(n) {
		case 1: result="짜장면"; break;
		case 2: result="우동"; break;
		case 3: result="짬뽕"; break;
		case 4: result="탕수육"; break;
		default: result="Wrong Input !";
		}
		
		System.out.println("주문음식 : "+result);


	}

}
