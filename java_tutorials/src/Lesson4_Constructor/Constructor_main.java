package Lesson4_Constructor;

public class Constructor_main {

	public static void main(String[] args) {
		
		Constructor con = new Constructor(); // ��ü ����
		
		// �̱��� ..? �ФФ�
		// Constructor c = Constructor.aa(); // -> �ٸ� Ŭ�������� �̹� new ����
		
		con.kor=99;
		con.aa();
		
		Constructor.eng=90; // ��ü���� X  Ŭ����.static����;
		// �߿��� �����ʹ� ���� static X -> ��ü �������� �������� ���ǹǷ� ..!

		
		

	}

}
