package Exam1_answers;
class Father2 
{
  int kor;
  int eng;
  int mat;
  
  public void hap()
  {
	  int hap=kor+eng+mat;
	  System.out.println(hap);
  }
	
}
// ���� Ŭ������ ����Ͽ� ����Ͻÿ�
// ���θ��� Test6�� ����(sci)�� �߰����� ���� ���Ͻÿ�.
// �Է��� ������� �Ͻÿ�.
public class Test6 extends Father2
{
	int sci;
	public void input() // �Է��ϴ� �κ�
	{
	  kor=90;
	  eng=80;
	  mat=70;
	  sci=80;
	}
	public void hap() // Overriding !!! (�Լ� ������)
    {
	  int hap=kor+eng+mat+sci;
	  System.out.println(hap);
	}
}
