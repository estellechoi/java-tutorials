package exam0529;
//���� �Է¹޾Ƽ� ���� ���ϴ� �ҽ��� Ŭ������ �ۼ��Ͻÿ�.
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