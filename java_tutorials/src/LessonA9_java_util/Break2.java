package LessonA9_java_util;
import java.util.Random;
public class Break2 {

	public static void main(String[] args) {
		
		Random ra = new Random();
		
		String mem[] = {"estelle", "carina", "jeremie", "dom"};
		
		// dom�� ��÷���Ѻ���
		
		int n;
		for(;;) {
			n = ra.nextInt(4); // 0 ~ 3
			if(n==3)
				break; // n�� 3�� �Ǹ� for�� ����
		}
		System.out.println("The winner : "+mem[n]);
		
		// dom ���� ���� ��÷
		
		for(;;) {
			n=ra.nextInt(4);
			if(n==3)
				continue; // n�� 3�� �Ǹ� �ٽ� ��÷
			else
				break; // n�� 3�� �ƴϸ� for�� ���� �� n=0,1,2 �� ����
		}
		System.out.println("The winner : "+mem[n]);

	}

}
