package test_draft;
import java.util.Scanner;
public class Return3 {
	
	// 3 �� ������ ���� �հ� ���
	
	Scanner sc = new Scanner(System.in);
	int kor;
	int eng;
	int mat;
	int sum;
	
	public void input() {
		
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
	}

	//�����Լ� 
	public int sum() {
		
		sum=kor+eng+mat;
		return sum;
	}

}
