package LessonA5_methods;

public class Single_main {
	
	public static void main(String[] args) {
		
		// Single s = new Single("youjin");
		// �Ű����� ���ؼ� Ŭ���� �����ϸ鼭 name �ʱⰪ ����
		// private �������̹Ƿ�, ��ü s ���� �Ұ�
		// s.input(20, 7);
		// s.cal();
		
		Single s = Single.getInstance();
		// static ������ �� class.member;
		// return s �� Single s
		// ��ü ���� X �� �����ؿ��� �� X (���� �ϴ� �� ! ��ȸ�� �ϴ� ���� .. ��)
		
		s.input(20, 7);
		s.cal();
		
	}

}
