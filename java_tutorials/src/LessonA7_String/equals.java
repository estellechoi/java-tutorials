package LessonA7_String;

public class equals {

	public static void main(String[] args) {
		
		// String is a class → 다양한 메소드 사용 가능
		// 자료형 처럼 사용할 수 있도록 특별히 처리한 클래스.
		
		String name = "youjin";
		
		String str = new String("youjin");
		
		System.out.println(name+" "+str);
		
		
		// * 자료형이 아니라는 증거
		//   객체변수 name == str 비교하면
		//   저장된 Class가 다르기 때문에 다르다고 인식
		if(name == str)
			System.out.println("Same");
		else
			System.out.println("Diff");
		
		// * String 객체의 값 비교
		if(name.equals(str))
			System.out.println("Same");
		else
			System.out.println("Diff");

	}

}
