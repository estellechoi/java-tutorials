package Lesson4_Constructor;

public class Constructor {

	int kor;
	
	//static 
	static int eng;
	
	// ������� (��������) -> ���⼭ �Ⱦ��� main���� �ٷ� ȣ�� ����
	
	Constructor() 
	{
		System.out.println("hello.");
	}
	
	public Constructor aa() {
		Constructor c = new Constructor();
		return c;
	}
	
	
	
}
