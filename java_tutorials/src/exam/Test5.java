package exam;
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
	public Test5(int kor, int eng, int mat) {
		
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	
}
