package exam0529;
// ����ڿ��� 1~4�� ���ڸ� �Է¹޾Ƽ� �Է¹��� ���ڿ� ���� ������ ����.
// 1. ¥��� 2. �쵿 3. «�� 4. ������
import java.util.Scanner;
public class Exam5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~4 �� �ϳ��� ���� �Է��ϼ���.");
		int n=sc.nextInt();
		String result;
		
		switch(n) {
		case 1: result="¥���"; break;
		case 2: result="�쵿"; break;
		case 3: result="«��"; break;
		case 4: result="������"; break;
		default: result="Wrong Input !";
		}
		
		System.out.println("�ֹ����� : "+result);


	}

}
