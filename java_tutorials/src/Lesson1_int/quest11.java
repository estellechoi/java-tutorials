package Lesson1_int;
import java.util.Scanner;
public class quest11 {

	public static void main(String[] args) {
		// 11. Scanner�� ���� num1,num2,num3�� ������ ���� ������ �� ���� ������ ������� ����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		int num [] =new int [3];
		
		for (int i=0; i<num.length; i++) {
			System.out.print("input any number.");
			num[i] = sc.nextInt();
		}
		
			
			if (num[0]>num[1]){
				if (num[0]>num[2]) {
					System.out.println(num[0]);
					if (num[1]>num[2]) {
						System.out.println(num[1]);
						System.out.println(num[2]);
					}	
					else {
						System.out.print(num[2]);
						System.out.print(num[1]);
					}
				}
			}
			else if  (num[1]>num[2]){
				System.out.println(num[1]);
				
				if (num[0]>num[2]) {
					System.out.println(num[0]);
					System.out.println(num[2]);
				}
					else {
						System.out.println(num[2]);
						System.out.println(num[0]);
					}
			}
			
			else {
				System.out.println(num[2]);
				System.out.println(num[1]);
				System.out.println(num[0]);
				
			}
		

	}

}
