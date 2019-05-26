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
   // 생성자의 접근제한자가 private이다 싱글톤을 이용하여 
   // 객체를 생성하시오.
   
   // * public static 자료형 함수명() {}
   
   public static Test4 getInstance() {
	   
	   Test4 t4 = new Test4(1, 2); // ?? 여기서 초기값 지정이 필수인가 ??
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
