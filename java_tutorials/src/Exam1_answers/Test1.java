package Exam1_answers;
public class Test1 
{
   int num1;
   int num2;
   // ��ü�� �����Ҷ� num1�� num2�� ���� �������ÿ�
   // �����ڸ� ���� �ΰ��� �Ӽ��� ���� �ʱ�ȭ
   Test1(int num1,int num2)
   {
	   this.num1=num1;
	   this.num2=num2;
   }
   
   public void hap()
   {
	   // num1�������� num2������ ���� ���Ͻÿ�.
	   int tot=0;
	   for(int i=num1;i<=num2;i++)
		   tot=tot+i;
	   
	   System.out.println(tot);
   }
}
