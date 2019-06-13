package LessonA9_java_util;
import java.util.Random;
public class util_Random_nextInt {

	public static void main(String[] args) {
		
		// 시작 : 1020  끝 : 1099
		// int x = ra.nextInt("범위") + "시작값";
		
		Random ra = new Random();
		
		int lotto = ra.nextInt(80) + 1020;
		System.out.println(lotto);
		
		// * 무한반복
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
		System.out.println(n+" 번째 → "+xx);

	}

}
