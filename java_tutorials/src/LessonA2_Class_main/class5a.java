package LessonA2_Class_main;
import java.util.Scanner;
public class class5a {

	// 24. �л� 5���� ��,��,�� ������ �Է¹޾Ƽ� �հ�� ����� ���Ѵٰ� �Ҷ� 
    // �� ������ ������ �迭�� ������ //  Scanner�� ���� �Է¹����� 
    // ���� �հ�� ����� ���� sum,avg��� �̸��� �迭�� ������ �Է��Ͻÿ�.
	
	int kor[] = new int[5];
	int eng[] = new int[5];
	int mat[] = new int[5];
	
	int sum[] = new int[5];
	int avg[] = new int[5];
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<=4; i++) {
			kor[i] = sc.nextInt();
			eng[i] = sc.nextInt();
			mat[i] = sc.nextInt();
		}
	}
	
	public void cal() {
		
		for(int i=0; i<=4; i++) {
		sum[i]=kor[i]+eng[i]+mat[i];
		avg[i]=sum[i]/3;
		}
		
		for(int i=0;i<=4; i++) {
		
		System.out.println("SUM: "+sum[i]+" AVG: "+avg[i]);
		}

	}
	
	

}
