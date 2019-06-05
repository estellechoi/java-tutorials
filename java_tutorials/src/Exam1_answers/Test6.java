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
// 위의 클래스를 상속하여 사용하시오
// 새로만들 Test6은 과학(sci)을 추가시켜 합을 구하시오.
// 입력은 마음대로 하시오.
public class Test6 extends Father2
{
	int sci;
	public void input() // 입력하는 부분
	{
	  kor=90;
	  eng=80;
	  mat=70;
	  sci=80;
	}
	public void hap() // Overriding !!! (함수 재정의)
    {
	  int hap=kor+eng+mat+sci;
	  System.out.println(hap);
	}
}
