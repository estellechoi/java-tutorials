package test_fir;
import java.util.Scanner;
public class quest16 {

	public static void main(String[] args) {
		// 16. Scanner�� n�̶�� ������ ���� �Է¹��� ��  1���� n ������ ���� ���Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input any number. ");int n=sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum=sum+i;
		}
		
		System.out.print(sum);

	}

}
