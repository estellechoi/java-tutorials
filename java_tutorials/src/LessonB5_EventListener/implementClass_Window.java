package LessonB5_EventListener;

// * �������̽� WindowListener
//   : Frame���� �̺�Ʈ(Ŭ�� ��) �߻� �� ����� �޼ҵ带 ���� �������̽� 
//     �������̽� ����(�������̵�)�� ���� �޼ҵ� 7���� ������
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class implementClass_Window extends Frame implements WindowListener {

	implementClass_Window() {
		setVisible(true);
		pack();
		// * add WindowListener on this Frame. (���� â�� �̺�Ʈ������ �߰�)
		addWindowListener(this);
	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// ���α׷� ����
		System.out.println("���α׷� ����");
		System.exit(0); // ���� ��ư
	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("������ȭ ���"); // �ּ�ȭ ��ư
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("������ȭ"); // �ּ�ȭ ��ư
	}

	@Override
	public void windowOpened(WindowEvent e) {

	}

}
