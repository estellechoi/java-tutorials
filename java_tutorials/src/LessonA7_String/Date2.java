package LessonA7_String;
import java.util.Date;

public class Date2 {

	public static void main(String[] args) {
		
		// ���Կ����� ����, ������ = ���� �ڷ��� ���ƾ� ��
				
		//�� ����
			
		int a = 99;
		int b = a;

		//char aa = b;  �ڷ��� �ٸ�
				
		//�� �迭
		
		int kor[] = new int[3];
		kor[0]=100;
		kor[1]=90;
		kor[2]=80;
		
		int kk[] = kor;
		
		System.out.println(kk[2]);
				
		//��ü
		Date today=new Date();
		System.out.println(today.getDate());
				
		Date t = today;
		System.out.println(t.getDate());

	}

}
