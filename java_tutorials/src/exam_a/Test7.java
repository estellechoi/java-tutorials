package exam_a;
abstract class Good
{
	int kor;
	int eng;
	int mat;
	// ������ ��
	public abstract void hap();
	
	// ���
	public abstract void avg();
	
	// ���� ���� �Է�
	public abstract void input();
	
	// ��հ� �հ� ���
	public abstract void chul();
}
// ���� ���� �߻�Ŭ������ �ִ�. 3������ �Է��Ͽ�
// ��,����� ���ϰ� ����ϴ� �޼ҵ带 �ϼ��Ͻÿ�.
public class Test7 extends Good
{
   int total;
   int average;
   public void hap() // Override abstract functions.
   {
	   total=kor+eng+mat;
   }
   public void avg()
   {
	   average=(kor+eng+mat)/3;
   }
   public void input()
   {
	   kor=90;
	   eng=90;
	   mat=80;
   }
   public void chul()
   {
	   System.out.println(total+" "+average);
   }
}















