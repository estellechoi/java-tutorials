package LessonA3_return;
import java.util.Scanner;
public class Test11 {

		// 11. Scanner�� ���� num1,num2,num3�� ������ ���� ������ �� ���� ������ ������� ����Ͻÿ�.

		int n1;
		int n2;
		int n3;
		Scanner sc = new Scanner(System.in);
		
		public void input() {
			n1=sc.nextInt();
			n2=sc.nextInt();
			n3=sc.nextInt();
		}
		
		public void print() {
			
			if(n1>n2 && n1>n3 && n2>n3)
			   System.out.print(n1+" "+n2+" "+n3);			
			else if(n1>n2 && n1>n3 && n3>n2)
				System.out.print(n1+" "+n3+" "+n2);
			else if(n2>n3 && n2>n1 && n1>n3)
				System.out.print(n2+" "+n1+" "+n3);
			else if(n2>n3 && n2>n1 && n3>n1)
				System.out.print(n2+" "+n3+" "+n1);
			else if(n3>n1 && n3>n2 && n2>n1)
				System.out.print(n3+" "+n2+" "+n1);
			else
				System.out.print(n3+" "+n1+" "+n2);

		}

}
