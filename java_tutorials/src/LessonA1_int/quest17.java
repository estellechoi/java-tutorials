package LessonA1_int;
import java.util.Scanner;
public class quest17 {

	public static void main(String[] args) {
		// 17. Scanner�� n , m �̶�� ������ ���� �Է¹��� ��  n���� m������ ���� ���Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input any number. "); int n=sc.nextInt();
		System.out.print("Input one more. "); int m=sc.nextInt();
		
		int sum=0;
		
		if (n<=m) {
			for(int i=n; i<=m; i++) {
				sum=sum+i;
			}
		}
		else {
			for(int i=m; i<=n; i++) {
				sum=sum+i;
			}
		}
		
		System.out.print(sum);
		

		
		
		
		
	}

}
