package LessonA1_int;
import java.util.Scanner;
public class quest6 {

	public static void main(String[] args) {
		// 6. ���� ������ Scanner�� �Է¹��� ��, 60�� �̻��̸� "�հ�"�� ����ϰ� 60�� �̸��̸� "���հ�" ����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("mat: "); int mat = sc.nextInt();
		
		if (mat>=60)
			System.out.print("Pass");
		else
			System.out.print("Fail");


	}

}
