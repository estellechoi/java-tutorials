package Exam1;
import java.util.Scanner;
abstract class Good
{
	int kor;
	int eng;
	int mat;
	// ������ ��
	public abstract void hap();
	
	// ���
	public abstract void avg();
	
	// ���� ���� �Է�
	public abstract void input();
	
	// ��հ� �հ� ���
	public abstract void chul();
}
// ���� ���� �߻�Ŭ������ �ִ�. 3������ �Է��Ͽ�
// ��,����� ���ϰ� ����ϴ� �޼ҵ带 �ϼ��Ͻÿ�.
public class Test7 extends Good 
{
	int hap;
	int avg;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
	}
	
	public void hap() {
		hap=kor+eng+mat;
	}
	
	public void avg() {
		avg=(kor+eng+mat)/3;
	}
	
	public void chul() {
		System.out.println("�� : "+hap+" / �� : "+avg);
	}
	

}
