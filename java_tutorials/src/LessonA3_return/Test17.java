package LessonA3_return;
import java.util.Scanner;
public class Test17 {

	// 17. Scanner�� n , m �̶�� ������ ���� �Է¹��� ��  n���� m������ ���� ���Ͻÿ�..
	
	Scanner sc = new Scanner(System.in);
	int a=0;
	int n;
	int m;
	
	public void input() {
		n=sc.nextInt();
		m=sc.nextInt();
	}
	
	public void plus() {
		if(n<=m) {
			for(int i=n; i<=m; i++)
				a=a+i;
		}
		else {
			for(int i=m; i<=n; i++)
				a=a+i;	
		}
	}
	
	public void print() {
		System.out.println(a);
	}
}
