package test_fir;
import java.util.Scanner;
public class quest7 {

	public static void main(String[] args) {
		
		// 7. ��,��,���� ������ Scanner�� �Է¹��� �� ���ο� ���ð��� 1,2,3 �߿� �ϳ��� �Է¹޾Ƽ�
		// 1�� �ԷµǸ� ���������� ��� 2�� �Է¹����� ���������� ���, 3�� �Է¹����� ���� ������ ����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("kor: "); int kor = sc.nextInt();
		System.out.print("eng: "); int eng = sc.nextInt();
		System.out.print("mat: "); int mat = sc.nextInt();
		
		System.out.print("Select a number from 1 to 3. ");
		
		
		int select = sc.nextInt(); // select=1; 2; 3;
		
		switch (select) {
		
		case 1 : System.out.print(kor); break;
		case 2 : System.out.print(eng); break;
		case 3 : System.out.print(mat); break;
		default: System.out.print("You selected wrong number.");
		}
		
		

		

	}

}
