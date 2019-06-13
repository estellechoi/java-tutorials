package LessonA7_String;

public class trim {

	public static void main(String[] args) {
		
		// trim() : 문자열 좌,우의 space 제거 (문자간 space는 제거 못 함)
		// replace() 메소드를 통해서도 delete space
		
		String str = "hello     world.";
		String tr = str.trim();
		String de = tr.replace(" ", "");
		
		System.out.println(str.length()+" → "+tr.length()+" → "+de.length());
		
		
		String str2 = "  hello          world.";
		String tr2 = str2.trim();
		String de2 = tr2.replace(" ","");
		
		System.out.println(str2.length()+" → "+tr2.length()+" → "+de2.length());

	}

}
