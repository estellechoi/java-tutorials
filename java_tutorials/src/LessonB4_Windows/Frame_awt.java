package LessonB4_Windows;
// awt, swing �� ������ ���α׷���

import java.awt.*;
import javax.swing.*;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

public class Frame_awt {

	public static void main(String[] args) {

		// * ������ ������ �����
		// â �ݱ� ��ư Ŭ�� ��, ��� ���� �ʿ�
		Frame f = new Frame();

		// �� setVisible, setSize ���� �ʼ�
		f.setVisible(true);
		f.setSize(200, 200);

		// * ��ư Ŭ���� ��ü ����
		Button btn = new Button("Ŭ��");
		// * Frame.add(x); ������ �ȿ� x �ֱ�
		f.add(btn);
		
// * ��
//		Label aa = new Label("hello");
//		f.add(aa);
// getText (����� �Է°� ��������)
// eventListener, keyListener(�ڹ� ���� �������̽�)

		// â �ݱ� ��ư Ŭ�� ��, â ����
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setSize(300, 300);

	}

}
