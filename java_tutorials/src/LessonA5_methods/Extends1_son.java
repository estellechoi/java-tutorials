package LessonA5_methods;

public class Extends1_son extends Extends1{
	
	// Overloading �ÿ���, �Ű����� ���� �⺻ �����ڰ� �������� �ʴ´�.
	Extends1_son() {
		System.out.println("Agree.");
	}
	
	
	// �ںθ� Ŭ���� �����ڰ� �Ű����� ���� ���� ��
	
	Extends1_son(int par, int age) {
		// �ڽ� �����ڰ� �Ű����� int par ���� �޾Ƽ� �θ� ������ int age ������ ����
		super(par);
		// this(); = Extends1_son(); �����ڸ� �ǹ�
		// super(); = Extends1(); �θ� ������ �ǹ�
		System.out.println("Son "+age);
	}

}
