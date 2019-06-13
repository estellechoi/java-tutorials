package LessonA9_java_util;
import java.util.Random;
public class Break2 {

	public static void main(String[] args) {
		
		Random ra = new Random();
		
		String mem[] = {"estelle", "carina", "jeremie", "dom"};
		
		// dom을 당첨시켜보자
		
		int n;
		for(;;) {
			n = ra.nextInt(4); // 0 ~ 3
			if(n==3)
				break; // n이 3이 되면 for문 종료
		}
		System.out.println("The winner : "+mem[n]);
		
		// dom 빼고 랜덤 당첨
		
		for(;;) {
			n=ra.nextInt(4);
			if(n==3)
				continue; // n이 3이 되면 다시 추첨
			else
				break; // n이 3이 아니면 for문 종료 → n=0,1,2 값 상태
		}
		System.out.println("The winner : "+mem[n]);

	}

}
