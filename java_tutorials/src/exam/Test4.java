package exam;
import java.util.Scanner;

public class Test4
{
   int num1;
   int num2;
   
   private Test4(int num1,int num2)
   {
	   this.num1=num1;
	   this.num2=num2;
   }
   // �������� ���������ڰ� private�̴� �̱����� �̿��Ͽ� 
   // ��ü�� �����Ͻÿ�.
   
   // * public static �ڷ��� �Լ���() {}
   
   public static Test4 getInstance() {
	   
	   Test4 t4 = new Test4(1, 2); // ?? ���⼭ �ʱⰪ ������ �ʼ��ΰ� ??
	   return t4;
   }
   
   public void input() {
	   Scanner sc = new Scanner(System.in);
	   num1=sc.nextInt();
	   num2=sc.nextInt();
   }
   
   public void println() {
	   System.out.print(num1+num2);
   }
   
   
   
}
