package Lesson3_return;
import java.util.Scanner;
public class Test7 {

	
		// 7. ��,��,���� ������ Scanner�� �Է¹��� �� ���ο� ���ð��� 1,2,3 �߿� �ϳ��� �Է¹޾Ƽ�
		// 1�� �ԷµǸ� ���������� ��� 2�� �Է¹����� ���������� ���, 3�� �Է¹����� ���� ������ ����Ͻÿ�.
		
		int kor;
		int eng;
		int mat;
		int sel;
		Scanner sc = new Scanner(System.in); // can use 'sc' in any function.
		
		public void input() {
			
			int aaa; // *�������� : made in a function, not in a class.
			
			kor=sc.nextInt();
			eng=sc.nextInt();
			mat=sc.nextInt();
			System.out.println("1:kor, 2:eng, 3:mat ");
			sel=sc.nextInt();
		}
		
		public void print() {
			switch(sel) {
			case 1: System.out.print(kor); break;
			case 2: System.out.print(eng); break;
			case 3: System.out.print(mat); break;
			default: System.out.print("Wrong Input!");
			}
				
		}
	
}
