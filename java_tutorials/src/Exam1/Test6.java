package Exam1;
class Father2 
{
  int kor;
  int eng;
  int mat;
    
  public int hap()  // * void ��� �ڷ���
  {
	  int hap=kor+eng+mat;
	  System.out.println("��+��+�� : "+hap); 
	  return hap; // return �� ���� ���� "�����Լ���" ������ ���� !
  }
	
}
// ���� Ŭ������ ����Ͽ� ����Ͻÿ�
// ���θ��� Test6�� ����(sci)�� �߰����� ���� ���Ͻÿ�.
// �Է��� ������� �Ͻÿ�.
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
	
	// *�̱���
	// 1) make a returning function named getInstance()
	// 2) it's static
	// 3) Test6(�ڷ���) instead of 'void' as returning
	public static Test6 getInstance() {
		Test6 t6 = new Test6(90,100,100,99); //4) copy itself
		return t6; // 5) return the object with the copied.
	}
	
	public void addsci() {
		int hap = hap();
		// save the returning function
		// in a new variable named 'hap'.
		
		int total=hap+sci;
		System.out.println("��+��+��+�� : "+total);
	}

}
