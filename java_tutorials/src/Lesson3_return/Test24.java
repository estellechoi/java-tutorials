package Lesson3_return;
import java.util.Scanner;
public class Test24 {

	// 24. �л� 5���� ��,��,�� ������ �Է¹޾Ƽ� �հ�� ����� ���Ѵٰ� �Ҷ� 
    // �� ������ ������ �迭�� ������ //  Scanner�� ���� �Է¹����� 
    // ���� �հ�� ����� ���� sum,avg��� �̸��� �迭�� ������ �Է��Ͻÿ�.
	
	int kor[]= new int[5];
	int eng[]= new int[5];
	int mat[]= new int[5];
	
	int sum[]= new int[5];
	int avg[]= new int[5];
	
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		for(int i=0; i<=4; i++) {
			System.out.println("kor : "); kor[i]=sc.nextInt();
			System.out.println("eng : "); eng[i]=sc.nextInt();
			System.out.println("mat : "); mat[i]=sc.nextInt();
		}
	}
	
	public void cal() {
		for(int i=0; i<=4; i++) {
			sum[i]=kor[i]+eng[i]+mat[i];
			avg[i]=sum[i]/3;
		}
	}
	
	public void print() {
		for(int i=0; i<=4; i++) {
		System.out.println
		("sum "+i+" : "+sum[i]+" / avg "+i+" : "+avg[i]);
	
		}
	}

}
