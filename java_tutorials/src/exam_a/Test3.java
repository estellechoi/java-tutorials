package exam_a;
public class Test3 
{
  int kor;
  int eng;
  int mat;
  int sci;
  // �޼ҵ� �����ε�
  // �޼ҵ忡 �Ű������� ������ ������ ������ŭ�� ����� ���Ͻÿ�.
  
  public void average(int kor)
  {
	  this.kor=kor;
	  System.out.println(this.kor);
  }
  public void average(int kor,int eng)
  {
	  this.kor=kor;
	  this.eng=eng;
	  int avg=(kor+eng)/2;
	  System.out.println(avg);
  }
  public void average(int kor,int eng,int mat)
  {
	  this.kor=kor;
	  this.eng=eng;
	  this.mat=mat;
	  int avg=(kor+eng+mat)/3;
	  System.out.println(avg);
  }
  public void average(int kor,int eng,int mat,int sci)
  {
	  this.kor=kor;
	  this.eng=eng;
	  this.mat=mat;
	  this.sci=sci;
	  int avg=(kor+eng+mat+sci)/4;
	  System.out.println(avg);
  }
}
