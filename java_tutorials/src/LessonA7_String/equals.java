package LessonA7_String;

public class equals {

	public static void main(String[] args) {
		
		// String is a class �� �پ��� �޼ҵ� ��� ����
		// �ڷ��� ó�� ����� �� �ֵ��� Ư���� ó���� Ŭ����.
		
		String name = "youjin";
		
		String str = new String("youjin");
		
		System.out.println(name+" "+str);
		
		
		// * �ڷ����� �ƴ϶�� ����
		//   ��ü���� name == str ���ϸ�
		//   ����� Class�� �ٸ��� ������ �ٸ��ٰ� �ν�
		if(name == str)
			System.out.println("Same");
		else
			System.out.println("Diff");
		
		// * String ��ü�� �� ��
		if(name.equals(str))
			System.out.println("Same");
		else
			System.out.println("Diff");

	}

}
