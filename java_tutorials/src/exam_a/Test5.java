package exam_a;
class Father 
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
// ���� Ŭ������ ����Ͽ� 3������ ���� ���ϴ� �޼ҵ带 �ϼ��Ͻÿ�.
// �Է��ϴ� �Լ��� FatherŬ������ �������� �ʴ´ٰ� �����Ѵ�.
// �Է��� ������� ó���Ͻÿ�.
public class Test5 extends Father
{
  public void input() // �Է��ϴ� �κ�
  {
	  kor=90;
	  eng=80;
	  mat=70;
  }
}
