package Lesson3_return;
import java.util.Scanner;
public class Test6 {

	// 6. ���� ������ Scanner�� �Է¹��� ��, 60�� �̻��̸� "�հ�"�� ����ϰ� 60�� �̸��̸� "���հ�" ����Ͻÿ�.
	
	int mat;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		mat=sc.nextInt();
	}
	
	public void print() {
		if(mat>=60)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}

}
