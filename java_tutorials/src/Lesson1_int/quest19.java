package Lesson1_int;
import java.util.Scanner;
public class quest19 {

	public static void main(String[] args) {
		// 19. 18�������� kor�迭�� ���� Scanner�� �Է��� ��  kor�迭�� ������ ����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input 6 values. ");
		
		int kor[] = new int[6];
		
		for(int i=0; i<kor.length; i++) {
			kor[i]=sc.nextInt();
			
		}
		
		for(int i=0; i<kor.length; i++) {
		System.out.print(kor[i]+" ");
		
		}

	}

}
