package Lesson1_int;
import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		//2. ��,��,�� 3������ ������ �Է¹޾� �հ�� ����� ����Ͻÿ�.


		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kor : "); int kor = sc.nextInt();
		System.out.println("Eng : "); int eng = sc.nextInt();
		System.out.println("Mat : "); int mat = sc.nextInt();
		
		System.out.println("Avg : "+(kor+eng+mat)/3);
		System.out.println("Sum : "+(kor+eng+mat));
		
		

	}

}
