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
// 위의 클래스를 상속하여 3과목의 합을 구하는 메소드를 완성하시오.
// 입력하는 함수는 Father클래스에 존재하지 않는다고 가정한다.
// 입력은 마음대로 처리하시오.
public class Test5 extends Father
{
	public Test5(int kor, int eng, int mat) {
		
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	
}
