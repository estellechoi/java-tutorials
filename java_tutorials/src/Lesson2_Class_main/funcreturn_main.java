package Lesson2_Class_main;

public class funcreturn_main {

	public static void main(String[] args) {


		funcreturn fr = new funcreturn();
		
		fr.input();
		fr.sum();
		
		// private int sum ���� ��� �� �� �ֳ�? (���ٱ����� private -> return�� ����� ����)
		
		int sum=fr.save(); // return�� �ִ� �Լ� �̱� ������ ���� �������� ���� �� �ִ� !
		                    // �ٸ� Ŭ���� �̱� ������, �Ȱ��� ������ sum ��� ����.
		
		System.out.println("returned sum is "+sum);

	}

}
