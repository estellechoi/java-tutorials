package LessonB4_Windows;

import java.awt.*;
import javax.swing.*;

public class awt_Button extends JFrame {

	// * �Ӽ� : �ڷ��� ����, �迭, Ŭ���� ����(��ü����)
	// * �ڷ��� ���� : �ϳ��� ���� ����
	// * Ŭ���� ���� : Ŭ������ ���Ե� �Ӽ��� �޼ҵ带 ��� ����
	Button buttonOkay = new Button("Ȯ��");
	JButton buttonCancel = new JButton("���");
	
	// * ������ : �ʱⰪ ����, ������Ʈ �߰�
	awt_Button() {
		
		// �ʱ� ����
		setVisible(true);
		setSize(200, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ������Ʈ �߰�(& ���̾ƿ� ����)
		setLayout(new FlowLayout());
		add(buttonOkay);
		add(buttonCancel);
	}
	
	// * �޼ҵ� : �Լ�
	
}
