package LessonA9_java_util;

public class Break {

	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++) {
			System.out.println(i+ " test");
			
			if(i == 1)
				break; // 여기서 for문을 종료하라
			System.out.println(i+ " test +");
		}
		
		System.out.println(" ");
		
		for(int i=0; i<10; i++) {
			if(!(i%2 == 0))
				continue; // 여기서 1회전 종료하고 다음 회전을 시작하라
			System.out.println(i);
		}

	}

}
