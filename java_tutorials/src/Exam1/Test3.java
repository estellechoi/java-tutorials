package Exam1;
public class Test3 
{
  int kor;
  int eng;
  int mat;
  int sci;
  // �޼ҵ� �����ε�
  // �޼ҵ忡 �Ű������� ������ ������ ������ŭ�� ����� ���Ͻÿ�.
  
  int avg;
  public void average(int kor)
  {
	 this.avg = kor;
  }
  
  public void average(int kor, int eng) {
	  this.avg= (kor+eng)/2;
  }
  
  public void average(int kor, int eng, int mat) {
	  this.avg =(kor+eng+mat)/3;
  }
  
  public void average(int kor, int eng, int mat, int sci) {
	  this.avg =(kor+eng+mat+sci)/4;
  }
  
  public void print() {
  System.out.println(avg);
  }
  
  
 
}
