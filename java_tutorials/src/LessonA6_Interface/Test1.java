package LessonA6_Interface;
// * what is the difference from abstract "class" ?
public interface Test1 { // �������̽� ���� �� public static final ���  + �߻�޼ҵ� (option: default/static)
	
	int kor = 100; // public static final �ڵ� �ο� �� �ڵ� final ó���ǹǷ�, ���� ������ ����
	public static final int eng = 100;
	
	void sum(); // public abstract method automatically.
	public abstract void print();

}
