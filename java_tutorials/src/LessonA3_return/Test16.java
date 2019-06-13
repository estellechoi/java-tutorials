package LessonA3_return;
import java.util.Scanner;
public class Test16 {

	// 16. Scanner로 n이라는 변수에 값을 입력받은 후  1부터 n 까지의 합을 구하시오..
	
	Scanner sc = new Scanner(System.in);
	int n;
	int aa=0;
	
	public void input() {
		n=sc.nextInt();
	}
	
	public void sum() {
		
		for(int i=0; i<=n; i++) {
			aa=aa+i;
		}
	}
	
	public void print() {
		System.out.println(aa);
	}

}
