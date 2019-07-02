package LessonB4_Windows;
// * ������ ���α׷���
// AWT(Abstract Window Toolkit) : GUI ���� �� (������ â, ��ư ��)
// Swing : AWT�� ������ �غ��ϱ� ���� ���� (�� �� �����ϰ� �پ��� �׷��� ������Ʈ�� ���)

import java.awt.*;
import javax.swing.*;
import com.sun.xml.internal.ws.org.objectweb.asm.Label;

public class Frame_awt {

	public static void main(String[] args) {

		// * ������ ������ �����
		// â �ݱ� ��� ���� �ʿ�
		Frame f = new Frame();

		// �� setVisible, setSize ���� �ʼ�
		f.setVisible(true);
		f.setSize(200, 200);

		// * ��ư Ŭ���� ��ü ����
		// * Frame.add(x); ������ �ȿ� x �ֱ�
		Button btn = new Button("Ŭ��");
		f.add(btn);

		// â �ݱ� ��ư Ŭ�� �� â ����
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setSize(300, 300);

	}

}


//* ��
//		Label aa = new Label("hello");
//		f.add(aa);
//getText (����� �Է°� ��������)
//eventListener, keyListener(�ڹ� ���� �������̽�)