package Lesson5_methods;

public class Static_main {

	public static void main(String[] args) {
		
		// * Instance Member
		// �Ӽ��� �޼ҵ� ������ ��ü ���� �ʿ�
		Static i = new Static();
		i.input(100);
		i.print();
		
		// * Static Member(���� ���)
		// ��ü �������� �ʰ� Ŭ������ �ٷ� ���� �� �޸� ���൵ �� ��
		// main(){}; JRE(�ڹٰ���ӽ�)���� �����Ŵ
		
		// * ���� : class.variable= value;
		Static.name = "youjin";
		Static.age = 27;
		Static.aa("!");

	}

}
