package LessonA4_Constructor;

public class ConsOver_main {

	public static void main(String[] args) {
		
		// �Ű������� ������ ���� ..
		
		// ������ ���� kor, eng �ʱⰪ 60���� ��������.
		ConsOver co = new ConsOver(); 
		co.print(); 
		
		// �� ���� ������ �Ű������� ���� �ް�, ������ ������ �ʱⰪ �� �� ������.
		ConsOver co1 = new ConsOver(99);
		co1.print();
		
		ConsOver co2 = new ConsOver(99,88);
		co2.print();		
		

	}

}
