package LessonA3_return;
import java.util.Scanner;
public class Test16 {

	// 16. Scanner�� n�̶�� ������ ���� �Է¹��� ��  1���� n ������ ���� ���Ͻÿ�..
	
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
