package exam0529;
//값을 입력받아서 합을 구하는 소스를 클래스로 작성하시오.
import java.util.Scanner;
public class Exam4 {
	
	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	int tot;
	
	public void input() {
		System.out.print("a : "); a=sc.nextInt();
		System.out.print("b : "); b=sc.nextInt();
	}
	
	public void sum() {
		for(int i=a; i<=b; i++)
			tot=tot+i;
		System.out.println("sum : "+tot);
	}
}