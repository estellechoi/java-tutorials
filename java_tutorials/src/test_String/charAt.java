package test_String;

public class charAt {

	public static void main(String[] args) {
		
		// charAt (character at x) for String class.
		// str.charAt(x);
		// x : 0 ~
		String no = "123456-4234567";
		
		char ch = no.charAt(7); // index 7번의 문자를 가져온다
		
		if(ch=='1' || ch == '3')
			System.out.println("Male");
		else
			System.out.println("Female");

		// 시스템의 기본 문자셋으로 인코딩된 바이트 배열 얻기
		byte bytes[] = no.getBytes();
		
		for(int i=0; i<=10; i++)
			System.out.println(bytes[i]);
		
	}

}
