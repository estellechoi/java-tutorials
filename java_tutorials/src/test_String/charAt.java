package test_String;

public class charAt {

	public static void main(String[] args) {
		
		// charAt (character at x) for String class.
		// str.charAt(x);
		// x : 0 ~
		String no = "123456-4234567";
		
		char ch = no.charAt(7); // index 7���� ���ڸ� �����´�
		
		if(ch=='1' || ch == '3')
			System.out.println("Male");
		else
			System.out.println("Female");

		// �ý����� �⺻ ���ڼ����� ���ڵ��� ����Ʈ �迭 ���
		byte bytes[] = no.getBytes();
		
		for(int i=0; i<=10; i++)
			System.out.println(bytes[i]);
		
	}

}
