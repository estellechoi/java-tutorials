package LessonA7_String;

public class trim {

	public static void main(String[] args) {
		
		// trim() : ���ڿ� ��,���� space ���� (���ڰ� space�� ���� �� ��)
		// replace() �޼ҵ带 ���ؼ��� delete space
		
		String str = "hello     world.";
		String tr = str.trim();
		String de = tr.replace(" ", "");
		
		System.out.println(str.length()+" �� "+tr.length()+" �� "+de.length());
		
		
		String str2 = "  hello          world.";
		String tr2 = str2.trim();
		String de2 = tr2.replace(" ","");
		
		System.out.println(str2.length()+" �� "+tr2.length()+" �� "+de2.length());

	}

}
