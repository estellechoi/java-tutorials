package LessonA3_return;
import java.util.Scanner;
public class quest24 {

		// 24. �л� 5���� ��,��,�� ������ �Է¹޾Ƽ� �հ�� ����� ���Ѵٰ� �Ҷ� 
	    // �� ������ ������ �迭�� ������ //  Scanner�� ���� �Է¹����� 
	    // ���� �հ�� ����� ���� sum,avg��� �̸��� �迭�� ������ �Է��Ͻÿ�.
	
	int kor[] = new int[5];
	int eng[] = new int[5];
	int mat[] = new int[5];
	
	int sum[] = new int[5];
	int avg[] = new int[5];
	
	public void input() {
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
		kor[i]=sc.nextInt();
		eng[i]=sc.nextInt();
		mat[i]=sc.nextInt();
		
		}
	}
	
	public void sum() {
		for(int i=0; i<5; i++) {
			sum[i]= kor[i]+eng[i]+mat[i];
			System.out.println("sum"+(i+1)+" : "+sum[i]);
		}
		
	}
	
	public void avg() {
		
		for(int i=0; i<5; i++) {
			avg[i]=sum[i]/3;
			System.out.println("avg"+(i+1)+" : "+avg[i]);
		}
	}

}
