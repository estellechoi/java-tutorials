package exam_a;
public class Test3 
{
  int kor;
  int eng;
  int mat;
  int sci;
  // 메소드 오버로딩
  // 메소드에 매개변수로 들어오는 과목의 갯수만큼만 평균을 구하시오.
  
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
