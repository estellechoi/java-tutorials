package test_etc;

public class getProperty {

	public static void main(String[] args) {
		
		// System.getProperty("x"); �ý��ۿ��� x�� ��ġ�� �����Ͷ�
		
		// java.home
		String b = System.getProperty("java.home");
		System.out.println(b);
		
		// user.name
		String c = System.getProperty("user.name");
		System.out.println(c);

	}

}
