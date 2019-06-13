package LessonA9_java_util;
import java.util.Random;
public class util_Random {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		boolean r1 = ran.nextBoolean(); // true, false
		double r2 = ran.nextDouble(); // 실수
		int r3 = ran.nextInt(); // 정수 ( 0 ~ )
		int r4 = ran.nextInt(2); // 2 보다 작은 정수
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		int lotto = ran.nextInt(45)+1; // (0 ~ 44) + 1
		System.out.println(lotto);
		

	}

}
