package test_fir;
import java.util.Scanner;
public class quest5 {

	public static void main(String[] args) {
		
		// 5. ��������(0~100��)�� Scanner�� �Է� ���� ��, ABCDE�� ����Ͻÿ�. (90���̻� A 80���̻� B ..)
		
		
		Scanner sc= new Scanner(System.in);
		System.out.print("eng: "); int eng = sc.nextInt();
		
		if (eng<=100) {
			
			String result = null;
			
			if (eng>=90)
				result="A";
			else if (eng>=80)
				result="B";
			else if (eng>=70)
				result="C";
			else if (eng>=60)
				result="D";
			else
				result="E";
			
			System.out.print("Your grade is "+result);
			
				
		}
		else {
			System.out.print("Wrong Input !");
		}
		



	}

}
