package test_etc;

public class getProperty {

	public static void main(String[] args) {
		
		// System.getProperty("x"); 시스템에서 x의 위치를 가져와라
		
		// java.home
		String b = System.getProperty("java.home");
		System.out.println(b);
		
		// user.name
		String c = System.getProperty("user.name");
		System.out.println(c);

	}

}
