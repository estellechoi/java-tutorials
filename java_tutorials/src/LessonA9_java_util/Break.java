package LessonA9_java_util;

public class Break {

	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++) {
			System.out.println(i+ " test");
			
			if(i == 1)
				break; // ���⼭ for���� �����϶�
			System.out.println(i+ " test +");
		}
		
		System.out.println(" ");
		
		for(int i=0; i<10; i++) {
			if(!(i%2 == 0))
				continue; // ���⼭ 1ȸ�� �����ϰ� ���� ȸ���� �����϶�
			System.out.println(i);
		}

	}

}
