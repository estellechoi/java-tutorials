package Lesson5_methods;

public class Single {
	
	int n1;
	int n2;
	String name;
	
	// Ŭ������ �̸��� ���� ! ������(Constructor) �� name �ʱ�ȭ!
	// �� private ������ �� �ٸ� Ŭ�������� ��ü ���� �Ұ�
	// �� ���� Ŭ�������� ��ü ���� ��������. ��� ? return 
	private Single(String name) {
		this.name=name;
	}
	
	// �ڱ� Ŭ�������� ��ü ���� �������� (return)
	// static �̿� �� ��? �ܺο��� ��ü �������� ������ �� �����ϱ�
	public static Single getInstance() { // �� static �޼ҵ� ������
		Single s = new Single("youjin"); // �� Ŭ���� ������ ��ü s ����
		return s; // �� ��ü s ����
		// ���ϰ��� Ŭ���� ������ ��ü�̱� ������ �� �ڷ���: Single(Ŭ������)
	}
	
	public void input(int n1, int n2) {
		this.n1=n1;
		this.n2=n2;
	}
	
	public void cal() {
		int sum=n1+n2;
		System.out.println(name+" is "+sum);
	}

}
