package Exam1;
public class Test3 
{
  int kor;
  int eng;
  int mat;
  int sci;
  // 메소드 오버로딩
  // 메소드에 매개변수로 들어오는 과목의 갯수만큼만 평균을 구하시오.
  
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
