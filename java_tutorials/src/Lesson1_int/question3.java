package Lesson1_int;
import java.util.Scanner;
public class question3 {

	public static void main(String[] args) {
		//3. ��,��,�� 3������ ������ �Է¹޾� ����� 60�� �̸��̸�
		//"������Դϴ�" ����ϰ� 60�� �̻��̸� "�����մϴ�" ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kor : "); int kor = sc.nextInt();
		System.out.println("Eng : ");int eng = sc.nextInt();
		System.out.println("Mat : ");int mat = sc.nextInt();
		
		int avg = kor+eng+mat;
		
		if (avg<60) {
			System.out.println("Please retry.");
		}
		else {
			System.out.println("Congratulations!");
		}
		
		
		



	}

}
