package exam_a;
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
   
   public static Test4 getInstance(int num1,int num2)
   {
	   Test4 t4=new Test4(num1,num2);
	   
	   return t4;
   }
}
