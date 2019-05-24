package test_method;
// �߻� Ŭ���� (Abstract Class)
// : a type of ����Ŭ���� (�ܵ� ��ü ���� x)
// : ��üŬ�����鿡�� �������� �����? �ʵ�/�޼ҵ� ������ Ŭ����

// how to use
// - The abstract just declares methods without {}.
// - the methods are overridden(������) later when used.



public abstract class Abstract {
	
	int kor;
	
	/* �� abstract method without {}.
	   necessarily includes more than one abstract method,
	   when an abstract class is made.
	*/
	public abstract void input(); // will be overridden later.
	
	
	// �� also has methods with {} defined.
	public void print() {
		System.out.println(" �� "+kor);
	}
	

}
