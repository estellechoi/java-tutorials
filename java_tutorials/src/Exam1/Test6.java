package Exam1;
class Father2 
{
  int kor;
  int eng;
  int mat;
    
  public int hap()  // * void 대신 자료형
  {
	  int hap=kor+eng+mat;
	  System.out.println("국+영+수 : "+hap); 
	  return hap; // return → 빨리 가서 "리턴함수를" 변수에 담자 !
  }
	
}
// 위의 클래스를 상속하여 사용하시오
// 새로만들 Test6은 과학(sci)을 추가시켜 합을 구하시오.
// 입력은 마음대로 하시오.
public class Test6 extends Father2
{
	int sci;
	
	// *private constructor
	// for users not to change the default values.
	private Test6(int kor, int eng, int mat, int sci) {
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		this.sci=sci;
	}
	
	// *싱글톤
	// 1) make a returning function named getInstance()
	// 2) it's static
	// 3) Test6(자료형) instead of 'void' as returning
	public static Test6 getInstance() {
		Test6 t6 = new Test6(90,100,100,99); //4) copy itself
		return t6; // 5) return the object with the copied.
	}
	
	public void addsci() {
		int hap = hap();
		// save the returning function
		// in a new variable named 'hap'.
		
		int total=hap+sci;
		System.out.println("국+영+수+과 : "+total);
	}

}
