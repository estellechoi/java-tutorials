package LessonA9_java_util;
import java.util.Random;
public class util_Random_nextInt {

	public static void main(String[] args) {
		
		// ���� : 1020  �� : 1099
		// int x = ra.nextInt("����") + "���۰�";
		
		Random ra = new Random();
		
		int lotto = ra.nextInt(80) + 1020;
		System.out.println(lotto);
		
		// * ���ѹݺ�
		// for(int i=0; i<=0;) or for(;;)
		// while(true)
		int xx;
		int n = 0;
		
		for(;;) {
			xx = ra.nextInt(80)+1020; // (0 ~ 79) + 1020
			if(xx==1079)
				break;
			n++;
		}
		System.out.println(n+" ��° �� "+xx);

	}

}
