package Exam1;
public class Test1 
{
   int num1;
   int num2;
   
   // ��ü�� �����Ҷ� num1�� num2�� ���� �������ÿ�
   Test1(int num1,int num2)
   {
	   this.num1 = num1;
	   this.num2 = num2;
   }
   
   int sum=0;
   public void hap()
   {
	   // num1�������� num2������ ���� ���Ͻÿ�.
	  if(num1<=num2) {
	   for(int i=num1; i<=num2; i++)
		   sum=sum+i;
	  }
	  else {
		  for(int i=num2; i<=num1; i++)
			   sum=sum+i;
	  }
	   System.out.println(sum);
   }
}
